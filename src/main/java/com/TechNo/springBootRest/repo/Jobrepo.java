package com.TechNo.springBootRest.repo;


import com.TechNo.springBootRest.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class Jobrepo {
    List<JobPost> jobs =new ArrayList<>( Arrays.asList(
            new JobPost(1,"Java Developer",  "Must have good experience in core Java and advanced Java", 2,List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
            new JobPost(2,"QA Automation","Must Have good knowlage on Automation testing",3,List.of("Selenium","Java"))

    ));
    public List<JobPost> getAllJob(){

        return jobs;
    }

    public void addJob(JobPost job){
        jobs.add(job);
      System.out.println(jobs);
    }
    public JobPost getJob(int jobID){
        for(JobPost job:jobs){
            if(job.getPostId()==jobID){

                return job;
            }

        }

        return null ;
    }

    public void UpdateJob(JobPost updateRequest){

        for(JobPost job:jobs){

            if(updateRequest.getPostId()==job.getPostId()){
                job.setPostProfile(updateRequest.getPostProfile());
                job.setPostDesc(updateRequest.getPostDesc());
                job.setReqExperience(updateRequest.getReqExperience());
                job.setPostTechStack(updateRequest.getPostTechStack());

            }
        }
    }

    public void deleteJob(int PostID){
      for(JobPost job:jobs)  {
          if(job.getPostId()==PostID){
              jobs.remove(job);

          }

      }

    }
}
