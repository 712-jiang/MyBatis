package com.slq.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author qingqing
 * @function:
 * @create 2021-02-19-21:47
 */
@Data
public class Teacher {
    private int id;
    private String name;
    //一对多，查询老师下面的所有学生
    private List<Student> students;
}
