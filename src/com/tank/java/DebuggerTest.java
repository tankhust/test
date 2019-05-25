package com.tank.java;

import sun.management.Agent;

import java.util.HashMap;

/**
 * @author tank
 * @create 2019/05/25 16:09
 */
public class DebuggerTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Tom");
        map.put("age", "12");
        map.put("school", "Tsinghua");
        map.put("major", "computer");

        String age = map.get("age");
        System.out.println(age);

        map.remove(age);
        System.out.println(map);

    }
}
