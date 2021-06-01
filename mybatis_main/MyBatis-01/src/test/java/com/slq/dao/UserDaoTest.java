package com.slq.dao;

import com.slq.pojo.User;
import com.slq.utils.Mybatisutils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import javax.swing.text.Keymap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        List<User> users = mapper.selectUser();   //有了UserMapper类型的实例，即可调用接口方法：selectUser
        for (User user : users) {
            System.out.println(user);
        }
        //3.关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void getUserById(){
        SqlSession sqlSession = Mybatisutils.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);
        sqlSession.close();
    }

    @Test
    //增删改必须提交事务
    public void insertUser(){
        SqlSession sqlSession = Mybatisutils.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.insertUser(new User(4,"大橘为重","12345"));
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = Mybatisutils.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(4, "柴柴","12345"));
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = Mybatisutils.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(4);
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser2(){
        SqlSession sqlSession = Mybatisutils.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("mapid",1);
        //使用Map就可以用自己定义的key代替数据库中的名字，灵活
        //如果在接口配置文件中定义了name和pwd属性，这里只put了name属性，pwd将为null
        map.put("mapname", "青青");
        mapper.updateUser2(map);
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }
}




