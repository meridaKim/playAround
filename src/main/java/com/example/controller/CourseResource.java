package com.example.controller;

import com.example.model.entity.Course;
import com.example.service.CoursesHardcodedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
public class CourseResource {


    @Autowired
    private CoursesHardcodedService courseManagementService;

    @GetMapping("/instructors/{username}/courses")
    public List<Course> getAllCourses(@PathVariable String username) {
        return courseManagementService.findAll();
    }
}
