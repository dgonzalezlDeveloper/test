package es.example.test.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.query.Param;

import es.example.test.entity.Price;

//@Repository
public interface Repository extends JpaRepository<Price, Long> {

	List<Price> findByProductIdAndBrandId(String productId, String brandId);
	
}