package io.wdsolutions.hrpayroll.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.wdsolutions.hrpayroll.entities.Payment;
import io.wdsolutions.hrpayroll.services.PaymentServices;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {

	@Autowired
	private PaymentServices services;
	
	@GetMapping(value = "/{workId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable("workId")Long workrId, @PathVariable("days")Integer days){
		Payment payment = services.getPayment(workrId, days);
		return ResponseEntity.ok(payment);
	}
	
}
