package com.example.demo.service;

import com.example.demo.dao.courseDao;
import com.example.demo.entity.courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseServiceImp implements CourseService{
    @Autowired
   private courseDao coursesDao;


    @Override
    public List<courses> getCourses(){
        return coursesDao.findAll();
    }
    @Override
    public courses getCourse(int id){

        return  coursesDao.findById((long) id).get();
    }
    @Override
    public courses addCourse(courses Course){
        coursesDao.save(Course);
        return Course;
    }

    @Override
    public courses update(courses Course) {
        coursesDao.save(Course);
        return Course;
    }

    @Override
    public courses delete(int id) {
        courses entity=coursesDao.getOne((long) id);
        coursesDao.delete(entity);
        return null;
    }



   /* List<courses> arr;
    public CourseServiceImp(){
        this.arr=new ArrayList<>();
        arr.add(new courses(1L,"java","platform independent language"));
        arr.add(new courses(2L,"C++","I dnt know whether their framework exist or not "));
    }

    @Override
    public List<courses> getCourses(){
        return arr;
    }
    @Override
    public courses getCourse(int id){
        return arr.get(id-1);
    }
    @Override
    public courses addCourse(courses Course){
        arr.add(Course);
        return Course;
    }

    @Override
    public courses update(int id) {
        for(courses i: arr){
            if(i.getId()==(long)id){
                i.setId(440L);
                return i;
            }
        }return null;
    }

    @Override
    public courses delete(int id) {
        for(courses i: arr){
            if(i.getId()==(long)id){
                arr.remove(i);
                System.out.print("successful");
            }
        }return null;
    }*/


}
