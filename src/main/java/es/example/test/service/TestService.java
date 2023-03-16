package es.example.test.service;

import java.time.LocalDateTime;
import java.util.List;

import es.example.test.entity.DataDto;
import es.example.test.entity.Price;


public interface TestService {

	public DataDto getProductInformation(LocalDateTime dateTime, String productId, String brandId);
	
	public Price findByDateByOrderByPriority(List<Price> priceList, LocalDateTime dateTime);

}