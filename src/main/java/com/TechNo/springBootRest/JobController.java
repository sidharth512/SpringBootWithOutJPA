package com.TechNo.springBootRest;


import com.TechNo.springBootRest.model.JobPost;
import com.TechNo.springBootRest.service.jobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class JobController {
    @Autowired
    public jobService service;

    @GetMapping("getAllJobs")
    public List getAllJob(){
       return service.getAllJobs();

    }
    @GetMapping("jobPost/{JobID}")
    public JobPost getJob(@PathVariable("JobID") int JobID){ //PathVariable annotaction is useed for path variables
        return service.getjob(JobID);

    }

    @PostMapping("addJob")
    public JobPost addJob(@RequestBody JobPost jobBody){ //RequestBody annotaction is used to send the body in post
        service.addJob(jobBody);
        return service.getjob(jobBody.getPostId());
    }
    @PutMapping("addJob")
    public JobPost updateJob(@RequestBody JobPost updatedjob){
        service.updateJob(updatedjob);
        return service.getjob(updatedjob.getPostId());

    }
    @DeleteMapping("jobPost/{PostID}")
    public String deleteJob(@PathVariable int PostID){
        service.deleteJob(PostID);

        return "Deleted";
    }


}

