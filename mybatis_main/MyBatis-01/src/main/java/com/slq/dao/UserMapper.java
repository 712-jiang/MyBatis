package com.slq.dao;

import com.slq.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author qingqing
 * @function:
 * @create 2021-02-13-15:30
 */
public interface UserMapper {

    //查询所有用户
    List<User> selectUser();
    //根据id查询用户
    User getUserById(int id);
    //插入用户
    int insertUser(User user);
    //更新用户信息
    int updateUser(User user);
    //删除用户信息
    int deleteUser(int id);
    //使用万能的Map
    int updateUser2(Map<String, Object> map);


}
