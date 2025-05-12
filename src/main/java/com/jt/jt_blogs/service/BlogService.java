package com.jt.jt_blogs.service;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.jt.jt_blogs.model.Blog;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BlogService {
    private static final String BLOG_TABLE = "blogs";
    private final JdbcTemplate jdbcTemplate;
    public List<Blog> getBlogs() {
        var sql = "SELECT * FROM " + BLOG_TABLE;
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Blog.class));

    }

    public void addBlog(Blog blog) {
        var query = "INSERT INTO " + BLOG_TABLE + " (heading , description) VALUES (? , ?)";
        jdbcTemplate.update(query, blog.getHeading() , blog.getDescription()); 
    }

    public void getBlogById(int id) {
        var query = "SELECT * FROM " + BLOG_TABLE + " WHERE id = " + id;
        jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(Blog.class));    
    }
}
