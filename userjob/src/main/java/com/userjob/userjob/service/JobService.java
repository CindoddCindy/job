package com.userjob.userjob.service;

import com.userjob.userjob.model.Job;
import com.userjob.userjob.repository.JobRepository;
import com.userjob.userjob.request.JobRequest;
import com.userjob.userjob.response.JobResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class JobService {

  @Autowired
  JobRepository jobRepository;

  public List<Job> getAllJob(){
    return jobRepository.findAll();

  }
  public Optional<Job> findJobById(Long id ){
    return jobRepository.findById(id);

  }


}
