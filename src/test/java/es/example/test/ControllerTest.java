package es.example.test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import es.example.test.controller.Controller;
import es.example.test.entity.DataDto;
import es.example.test.entity.Price;
import es.example.test.service.TestServiceImp;

//@ExtendWith(MockitoExtension.class)
//@WebMvcTest(Controller.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ControllerTest {
	
	@InjectMocks
	private Controller controller;
	
	@Mock
	private RequestAttributes attributes;
	
	@Mock
	private TestServiceImp service; 
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		RequestContextHolder.setRequestAttributes(attributes);
		this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}
	
	@Test
	public void getInfoPrices() {
		
		String brandId = "1";
		String productId = "35455";
		LocalDateTime dateTime = LocalDateTime.parse("2020-06-14T10:00:00");
		
		List<Price> priceList = new ArrayList<>();
		
		Price price = service.findByDateByOrderByPriority(priceList, dateTime);
		
		Mockito.when(service.findByDateByOrderByPriority(priceList, dateTime)).thenReturn(price);
		
		Assert.assertNotNull(priceList);
		Assert.assertNotNull(price);
		
		DataDto data = new DataDto(price);
		
		Mockito.when(service.getProductInformation(dateTime, productId, brandId)).thenReturn(data);
		
		Assert.assertNotNull(data);
		
	}

}








