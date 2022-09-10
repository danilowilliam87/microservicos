package io.wdsolutions.hrwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.wdsolutions.hrwork.entities.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
