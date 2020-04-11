package com.firefight.service;

import com.firefight.bean.Blog;

import java.util.List;

public interface BlogService {
    int addBlog(Blog blog);
    List<Blog> findNew();
    int deleteById(int b_id);
    List<Blog> findBySort(String sort);
}
