//package es.example.test;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mockito;
//import org.mockito.Spy;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.test.web.servlet.MockMvc;
//
//import es.example.test.controller.Controller;
//import es.example.test.entity.Price;
//import es.example.test.repository.Repository;
//import es.example.test.service.TestServiceImp;
//
//@ExtendWith(MockitoExtension.class)
////@WebMvcTest(Controller.class)
//public class ExampleTest {
//	
////	@Autowired
////	private MockMvc mvc;
////	
////	@Test
////	public void firstTest() throws Exception {
////		RequestBuilder request = MockMvcRequestBuilders.get("/test/getPrices");
////		MvcResult result = mvc.perform(request).andReturn();
////		assertEquals("Hello", "");
////	}
//	
////	@Spy
////	private TestServiceImp serviceImp;
////	
////	@Spy
////	private Repository repository;
//	
//	@Test 
//	public void firstTest() {
//
//		TestServiceImp serviceImp = Mockito.spy(TestServiceImp.class);
//		Repository repository = Mockito.spy(Repository.class);
//		
//		List<Price> priceList = repository.findByProductIdAndBrandId("35455", "1");
//		
//		LocalDateTime dateTime = LocalDateTime.parse("2020-06-14T01:30:55.000-05:00");
//		
//		Price price = serviceImp.findByDateByOrderByPriority(priceList, dateTime);
//		
//		Mockito.when()
//		
//	}
//
//}
