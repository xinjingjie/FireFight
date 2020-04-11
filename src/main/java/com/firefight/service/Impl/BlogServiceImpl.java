package com.firefight.service.Impl;

import com.firefight.bean.Blog;
import com.firefight.dao.BlogDao;
import com.firefight.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogDao blogDao;

    @Override
    public int addBlog(Blog blog) {
        return blogDao.addBlog(blog);
    }

    @Override
    public List<Blog> findNew() {
        return blogDao.findNew();
    }

    @Override
    public int deleteById(int b_id) {
        return blogDao.deleteById(b_id);
    }

    @Override
    public List<Blog> findBySort(String sort) {
        return blogDao.findBySort(sort);
    }
}
