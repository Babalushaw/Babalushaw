package com.example.demo;

import com.example.demo.entity.courses;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private CourseService courseService;
    @GetMapping("/hello")
    public String hello(){
        return "welcome to India";
    }
    @GetMapping("/courses")
    public List<courses> getCourses(){

        return courseService.getCourses() ;
    }
    @GetMapping("/course/{id}")
    public courses getCourse(@PathVariable int id){

        return this.courseService.getCourse(id);
    }
    @PostMapping("/addCourse")
    public courses addCourses(@RequestBody courses Course){
        return this.courseService.addCourse(Course);
    }
    @PutMapping("/update/{id}")
    public courses update(@PathVariable int id){
        return this.courseService.update(id);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable int id){
        try {
            this.courseService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


}
