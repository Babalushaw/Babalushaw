package com.example.demo.service;
import com.example.demo.entity.courses;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CourseService {
    public  List<courses> getCourses();

   public courses getCourse(int id);

    public courses addCourse(courses Course);

    public courses update(courses Course);

    public courses delete(int id);
}
