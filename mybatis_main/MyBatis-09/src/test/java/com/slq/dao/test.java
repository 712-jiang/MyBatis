package com.slq.dao;

import com.slq.pojo.Blog;
import com.slq.utils.IDUtil;
import com.slq.utils.Mybatisutils;
import org.apache.ibatis.cache.Cache;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author qingqing
 * @function:
 * @create 2021-02-20-16:03
 */
public class test {
    @Test
    public void addBlog(){
        SqlSession sqlSession = Mybatisutils.getSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDUtil.genId());
        blog.setTitle("Mybatis如此简单");

        //固定参数
        blog.setAuthor("B站");
        blog.setCreatTime(new Date());
        blog.setViews(9999);

        mapper.addBlog(blog);

        blog.setId(IDUtil.genId());
        blog.setTitle("Java如此简单");
        mapper.addBlog(blog);
        //没有set固定参数，因为前面已经给blog注入了作者，时间，阅览量

        blog.setId(IDUtil.genId());
        blog.setTitle("Spring如此简单");
        mapper.addBlog(blog);

        blog.setId(IDUtil.genId());
        blog.setTitle("微服务如此简单");
        mapper.addBlog(blog);

        //增删改需要提交事务！！！！！！
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void getBlogIf(){
        SqlSession sqlSession = Mybatisutils.getSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<String, String> map = new HashMap<String, String>();
//      map不输入则全查询
        map.put("title","Mybatis如此简单");
        map.put("author","B站");
        List<Blog> blogs = mapper.getBlogIf(map);

        System.out.println(blogs);
        sqlSession.close();
    }


    @Test
    public void getBlogChoose(){
        SqlSession sqlSession = Mybatisutils.getSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<String, String> map = new HashMap<String, String>();
//      map不输入则全查询
        //满足一个条件直接执行
//        map.put("title","Mybatis如此简单");
        map.put("author","A站");
        List<Blog> blogs = mapper.getBlogChoose(map);

        System.out.println(blogs);
        sqlSession.close();
    }

}
