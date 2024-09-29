package com.TechNo.springBootRest.service;


import com.TechNo.springBootRest.model.JobPost;
import com.TechNo.springBootRest.repo.Jobrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class jobService {
    @Autowired
    public Jobrepo repo;

    public void addJob(JobPost job){

        repo.addJob(job);
    }

    public List getAllJobs(){

     return    repo.getAllJob();
    }

    public JobPost getjob(int JobID){
     return  repo.getJob(JobID);

    }
    public void updateJob(JobPost job){

        repo.UpdateJob(job);
    }
    public void deleteJob(int JobID){

        repo.deleteJob(JobID);
    }
}
