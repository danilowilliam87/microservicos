package io.wdsolutions.hrpayroll.services;

import org.springframework.stereotype.Service;

import io.wdsolutions.hrpayroll.entities.Payment;

@Service
public class PaymentServices {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Tio Patinha", 150.00, days);
	}
	
}
