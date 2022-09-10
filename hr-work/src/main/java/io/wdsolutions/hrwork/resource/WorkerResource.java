package io.wdsolutions.hrwork.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.wdsolutions.hrwork.entities.Worker;
import io.wdsolutions.hrwork.repository.WorkerRepository;

@RestController
@RequestMapping(name = "/workers")
public class WorkerResource {
	
	@Autowired
	private WorkerRepository repository;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable(value = "id")Long id){
	    Worker worker = this.repository.findById(id).get();
	    return ResponseEntity.ok(worker);
	}
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll(){
		List<Worker> workes = this.repository.findAll();
		return ResponseEntity.ok(workes);
	}
	
	

}
