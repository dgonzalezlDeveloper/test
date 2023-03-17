package es.example.test.service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.example.test.entity.DataDto;
import es.example.test.entity.Price;
import es.example.test.entity.RequestException;
import es.example.test.repository.Repository;

@Service
public class TestServiceImp implements TestService {

	@Autowired
	private Repository repository;
	
	public DataDto getProductInformation(LocalDateTime dateTime, String productId, String brandId) {
		
		List<Price> priceList = repository.findByProductIdAndBrandId(productId, brandId);

		Price price = findByDateByOrderByPriority(priceList, dateTime);
		
		return new DataDto(price);
	}
	
	public Price findByDateByOrderByPriority(List<Price> priceList, LocalDateTime dateTime) {
		
		Optional<Price> price = priceList.stream()
				.filter(x -> x.getEndDate().isAfter(dateTime) && x.getStartDate().isBefore(dateTime))
				.sorted(Comparator.comparingInt(Price::getPriority).reversed()).findFirst();
		
//		Optional<Price> price = Optional.ofNullable(priceList.stream()
//				.filter(x -> x.getEndDate().isAfter(dateTime) && x.getStartDate().isBefore(dateTime))
//				.sorted(Comparator.comparingInt(Price::getPriority).reversed()).findFirst().orElseThrow());
		
		if(!price.isPresent()) {
			throw new RequestException("P-500", "No filter");
		}
		return price.get();
	}
	
}