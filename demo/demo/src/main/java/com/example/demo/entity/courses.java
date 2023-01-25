package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class courses {
    @Id
    private long id;
    private String title;
    private String description;


    @Override
    public String toString() {
        return "courses{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public courses(long id, String title, String description)  {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
    }
    public courses(){}

    public courses(long id, String title) {
        this.id = id;
        this.title = title;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
