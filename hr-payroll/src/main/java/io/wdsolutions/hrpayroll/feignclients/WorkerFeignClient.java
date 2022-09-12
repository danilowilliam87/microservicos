package io.wdsolutions.hrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.swdsolutions.hrentities.Worker;

@Component
@FeignClient(name = "hr-workers", url = "http://localhost:8001", path = "/workers")
public interface WorkerFeignClient {
	
	@GetMapping("/{id}")
	ResponseEntity<Worker> findbyId(@PathVariable(value = "id")Long id);

}
