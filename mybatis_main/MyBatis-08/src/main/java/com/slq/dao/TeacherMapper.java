package com.slq.dao;

import com.slq.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

/**
 * @author qingqing
 * @function:
 * @create 2021-02-19-21:47
 */
public interface TeacherMapper {
    //
    public Teacher getTeacherById(@Param("tid") int id );
    public Teacher getTeacherById2(@Param("tid") int id );
}
