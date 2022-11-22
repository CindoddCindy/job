package com.userjob.userjob.controller;

import com.userjob.userjob.model.Job;
import com.userjob.userjob.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("http://dev3.dansmultipro.co.id/api/recruitment")
public class JobController {

  @Autowired
  JobService jobService;

  @GetMapping("/positions.json")
  public List<Job> getAllJobController(@RequestHeader("Authorization") String token){
    return jobService.getAllJob();

  }
  @GetMapping("/positions/{id}")
  public Optional<Job> findJobByIdController(@RequestHeader("Authorization") String token,@PathVariable(value = "id") Long  id ){
    return  jobService.findJobById(id);

  }


}
