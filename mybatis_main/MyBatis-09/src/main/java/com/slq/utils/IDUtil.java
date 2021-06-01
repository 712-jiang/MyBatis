package com.slq.utils;

import org.junit.jupiter.api.Test;

import java.util.UUID;

/**
 * @author qingqing
 * @function:
 * @create 2021-02-20-16:03
 */
public class IDUtil {
    public static String genId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    @Test
    public void test(){
        System.out.println(genId());
    }
}
