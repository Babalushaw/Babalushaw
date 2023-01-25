package com.example.demo.dao;


import com.example.demo.entity.courses;
import org.springframework.data.jpa.repository.JpaRepository;

//Here  we are extending spring jpa, so we do not need implementation class for courseDao Interface
public interface courseDao extends JpaRepository<courses,Long> {

}
