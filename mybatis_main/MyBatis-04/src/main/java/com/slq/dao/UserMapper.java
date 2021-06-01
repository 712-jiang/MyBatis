package com.slq.dao;

import com.slq.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author qingqing
 * @function:
 * @create 2021-02-13-15:30
 */
public interface UserMapper {


    //根据id查询用户
    @Select("select * from mybatis.user where id = #{id}")
    User getUserById(@Param("id") int id);
    //分页
//    List<User> getUserByLimit(Map<String, Integer> map);

}
