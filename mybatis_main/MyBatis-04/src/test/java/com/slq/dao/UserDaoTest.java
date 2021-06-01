package com.slq.dao;

import com.slq.pojo.User;
import com.slq.utils.Mybatisutils;
import org.apache.ibatis.session.SqlSession;

import org.apache.log4j.Logger;
import org.junit.Test;
import sun.rmi.runtime.Log;

import javax.crypto.spec.IvParameterSpec;
import java.util.HashMap;
import java.util.List;

/**
 * @author qingqing
 * @function:
 * @create 2021-02-13-16:29
 */
public class UserDaoTest {
//    获取测试类UserDaoTest的反射类型，通过getLogger生成对象logger，获取类的logger内容
//    如果logger被多个方法使用，提升作用域，放在最外面
    static Logger logger = Logger.getLogger(UserDaoTest.class);
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

    @Test
    public void Log4jtest(){
        //logger输出的等级
        logger.info("info：进入selectUser方法");
        logger.debug("debug：进入selectUser方法");
        logger.error("error: 进入selectUser方法");
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

//    @Test
//    public void getUserByLimit(){
//        SqlSession sqlSession = Mybatisutils.getSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        HashMap<String, Integer> map = new HashMap<String, Integer>();
//        map.put("startIndex", 1);
//        map.put("pageSize", 2);
//        List<User> users = mapper.getUserByLimit(map);
//        for (User user : users) {
//            System.out.println(user);
//        }
//        sqlSession.close();
//    }
}




