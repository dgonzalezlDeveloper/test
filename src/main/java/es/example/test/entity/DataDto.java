package es.example.test.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
//@Builder
public class DataDto {
	
	private Integer productId;
	private Integer brandId;
	private Integer priceList;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private double price;
	
//    public DataDto(Integer productId, Integer brandId, Integer priceList, LocalDateTime startDate, LocalDateTime endDate, double price) {
//        this.productId = productId;
//        this.brandId = brandId;
//        this.priceList = priceList;
//        this.startDate = startDate;
//        this.endDate = endDate;
//        this.price = price;
//    }
    
    public DataDto(Price price) {
        this.productId = price.getProductId();
        this.brandId = price.getBrandId();
        this.priceList = price.getPriceList();
        this.startDate = price.getStartDate();
        this.endDate = price.getEndDate();
        this.price = price.getPrice();
    }
    
//    public DataDto setProductId(Integer productId) {
//        this.productId = productId;
//        return this;
//    }
//    
//    public DataDto setBrandId(Integer brandId) {
//        this.brandId = brandId;
//        return this;
//    }
//    
//    public DataDto setPriceList(Integer priceList) {
//        this.priceList = priceList;
//        return this;
//    }
//    
//    public DataDto setStartDate(LocalDateTime startDate) {
//        this.startDate = startDate;
//        return this;
//    }
//    
//    public DataDto setEndDate(LocalDateTime endDate) {
//        this.endDate = endDate;
//        return this;
//    }
//    
//    public DataDto setPrice(double price) {
//        this.price = price;
//        return this;
//    }

//	public DataDto createData() {
//		return new DataDto(productId, brandId, priceList, startDate, endDate, price);
//	}
	
}
