package com.company;

import java.util.HashMap;

class Main {
    public static void main(String[] args) {

        // create a hashmap
        HashMap<String, Integer> numbers = new HashMap<>();

        System.out.println("Initial HashMap: " + numbers);
        // put() method to add elements
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("Put() sonrası HashMap: " + numbers);
    }
}