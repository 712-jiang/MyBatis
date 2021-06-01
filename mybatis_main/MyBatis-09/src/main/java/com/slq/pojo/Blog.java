package com.slq.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author qingqing
 * @function:
 * @create 2021-02-20-15:59
 */
@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date creatTime;  //属性名和sql字段名不一致
    private int views;
}
