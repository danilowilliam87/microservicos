package io.wdsolutions.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.swdsolutions.hrentities.Worker;
import io.wdsolutions.hrpayroll.entities.Payment;

@Service
public class PaymentServices {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${hr-worker.host}")
	private String workerHost;

	public Payment getPayment(long workerId, int days) {
		Map<String, String> variables = new HashMap<>();
		variables.put("id", ""+workerId);
		String url = workerHost + "/workers/{id}";
		Worker worker = restTemplate.getForObject(url, Worker.class, variables);
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
	
}
