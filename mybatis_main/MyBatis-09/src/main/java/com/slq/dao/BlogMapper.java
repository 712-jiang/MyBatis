package com.slq.dao;

import com.slq.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author qingqing
 * @function:
 * @create 2021-02-19-21:47
 */
public interface BlogMapper {
    //新增一个Blog
    void addBlog(Blog blog);
    //if判断获得Blog
    List<Blog> getBlogIf(Map map);
    //choose判断获得Blog
    List<Blog> getBlogChoose(Map map);
}
