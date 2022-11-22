package com.userjob.userjob.repository;

import com.userjob.userjob.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface JobRepository extends JpaRepository<Job, Long> {}
