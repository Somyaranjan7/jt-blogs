package com.jt.jt_blogs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jt.jt_blogs.model.Blog;

@Service
public class BlogService {
    public List<Blog> getBlogs() {
        var blog1 =  new Blog(1, "Introduction to Java", "A beginner's guide to understanding Java programming language.");
        var blog2 =  new Blog(2, "Spring Boot Essentials", "Key concepts and setup instructions for Spring Boot applications.");
        var blog3 =  new Blog(3, "REST API with Spring", "Learn how to build RESTful APIs using Spring framework.");
        var blog4 = new Blog(4, "Deploying Java Apps", "Step-by-step guide to deploying Java applications on cloud platforms.");

        return List.of(blog1 , blog2 , blog3 , blog4);
    }
}
