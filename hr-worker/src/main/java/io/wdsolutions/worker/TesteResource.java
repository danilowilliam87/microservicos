package io.wdsolutions.worker;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TesteResource {
	
	@GetMapping
	public ResponseEntity<String> helloWorld(){
		return ResponseEntity.ok("Hello World");
	}

}
