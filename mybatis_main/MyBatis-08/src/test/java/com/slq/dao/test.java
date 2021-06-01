package com.slq.dao;

import com.slq.pojo.Teacher;
import com.slq.utils.Mybatisutils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author qingqing
 * @function:
 * @create 2021-02-20-14:02
 */
public class test {
    @Test
    public void teacherToStudent(){
        SqlSession sqlSession = Mybatisutils.getSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacherById = mapper.getTeacherById(1);
        System.out.println(teacherById);
        sqlSession.close();
    }

    @Test
    public void teacherToStudent2(){
        SqlSession sqlSession = Mybatisutils.getSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacherById = mapper.getTeacherById2(1);
        System.out.println(teacherById);
        sqlSession.close();
    }
}
