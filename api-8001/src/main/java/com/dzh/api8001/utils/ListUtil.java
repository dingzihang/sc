package com.dzh.api8001.utils;


import java.util.Arrays;
import java.util.List;

/**
 * @author : 86175
 * @description :
 * @date : 2021/6/24
 */
public class ListUtil {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11, 12);
        int increment = 4;
        for(int i = 0 ; i< integers.size(); i=i+increment){
            List<Integer> integers1 = integers.subList(i, i + increment > integers.size() ? integers.size() : i+increment);
            System.out.println(integers1);
        }

    }

}
