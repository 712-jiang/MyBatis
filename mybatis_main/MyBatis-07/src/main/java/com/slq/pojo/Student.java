package com.slq.pojo;

import lombok.Data;

/**
 * @author qingqing
 * @function:
 * @create 2021-02-19-21:47
 */
@Data
public class Student {
    private int id;
    private String name;
    //多个学生可以是同一个老师，即多对一
    private Teacher teacher;
}
