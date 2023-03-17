package es.example.test.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import es.example.test.entity.DataDto;
import es.example.test.service.TestServiceImp;
/*import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;*/

@RestController
@RequestMapping("/test")
public class Controller {
	
	@Autowired
	TestServiceImp service;

	@ResponseBody
	@GetMapping(value = "/getPrices")
	public DataDto cancelSubscription(
			/*final HttpServletRequest request,*/
//			@RequestParam(value = "date", required = true) String date,
			@RequestParam("dateTime") 
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dateTime,
			@RequestParam(value = "product_id", required = true) String productId,
			@RequestParam(value = "brand_id", required = true) String brandId
			/*final HttpServletResponse response*/) {
		
		System.out.println("Start app");
		
		return service.getProductInformation(dateTime, productId, brandId);
//		return ResponseEntity.status(HttpStatus.OK).body("Creado correctamente");
//		return service.saveImage(imageId, propertyId, url);
	}

}
