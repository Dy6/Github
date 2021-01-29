package com.dy.demoWeb;

import java.util.HashMap;

/**
 * @author dy
 * @create 2021-01-30 6:21 上午
 */
public class DebugTest {

    public static void main(String[] args) {
        HashMap<String,String> map =new HashMap<>();
        map.put("name", "dy");
        DebugTest debugTest =new DebugTest();
        map =debugTest.debug(map);
        map.put("age", "25");
        map.put("school", "jiaxing");


        System.out.println(map);
        System.out.println(map.toString());
    }
    public HashMap<String, String> debug(HashMap<String,String> map1){
        map1.put("加什么", "加句话");
        return map1;
    }
}
