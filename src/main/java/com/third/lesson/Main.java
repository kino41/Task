package com.third.lesson;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> fruits = new HashMap<>();
        fruits.put(0, "Apple");
        fruits.put(1, "Peach");
        fruits.put(2, "Grape");

        System.out.println(fruits.get(0));

        try {
            fruits.get(3);
            {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Not found");
        }
    }
}
