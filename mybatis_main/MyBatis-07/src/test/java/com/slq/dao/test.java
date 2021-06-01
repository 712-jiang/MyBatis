package com.slq.dao;

import com.slq.pojo.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.slq.utils.Mybatisutils;
import java.util.List;

/**
 * @author qingqing
 * @function:
 * @create 2021-02-19-21:55
 */
public class test {

    @Test
    public void testGetStudents(){
        SqlSession session = Mybatisutils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);

        List<Student> students = mapper.getStudents();
        for (Student student : students) {
            System.out.println(student);
        }

        for (Student student : students){
            System.out.println(
                    "学生名:"+ student.getName()
                            +"\t老师:"+student.getTeacher().getName());
        }
    }

    @Test
    public void testGetStudents2(){
        SqlSession session = Mybatisutils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);

        List<Student> students = mapper.getStudents2();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
