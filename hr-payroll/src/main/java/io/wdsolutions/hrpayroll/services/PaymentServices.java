package io.wdsolutions.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swdsolutions.hrentities.Worker;
import io.wdsolutions.hrpayroll.entities.Payment;
import io.wdsolutions.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentServices {
	
	@Autowired
	private WorkerFeignClient client;
	
	public Payment getPayment(long workerId, int days) {
		Worker worker = client.findbyId(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
	
}
