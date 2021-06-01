package com.slq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qingqing
 * @function:
 * @create 2021-02-13-15:37
 */
//创建实体类
@Data                 /*包含了@ToString，@EqualsAndHashCode，@Getter / @Setter等方法*/
@AllArgsConstructor   /*为类提供一个全参的构造方法*/
@NoArgsConstructor    /*为类提供一个无参的构造方法*/
public class User {
    private int id;
    private String name;
    private String pwd;
}
