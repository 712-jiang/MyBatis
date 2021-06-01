package com.slq.dao;

import com.slq.pojo.Student;

import java.util.List;

/**
 * @author qingqing
 * @function:
 * @create 2021-02-19-21:47
 */
public interface StudentMapper {

    public List<Student> getStudents();
    public List<Student> getStudents2();
}
