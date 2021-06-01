package com.slq.dao;

import com.slq.pojo.User;
import com.slq.utils.Mybatisutils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author qingqing
 * @function:
 * @create 2021-02-13-16:29
 */
public class UserDaoTest {
    @Test
    public void test01(){
        //1.获取SqlSession对象
        SqlSession sqlSession = Mybatisutils.getSession();
        //2.方法一：创建mapper实例，执行接口中的方法
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);  //用getMapper方法获取到UserMapper接口定义的类型
        //3.有了UserMapper类型的实例，即可调用接口方法：getUserById
        User user = mapper.getUserById(1);
        System.out.println(user);
        //4.关闭SqlSession
        sqlSession.close();
    }
}




