package com.java.collections;

import com.java.streamExample.Person;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        // Example usage of HashMaps can be added here
        System.out.println("HashMaps example");
        HashMap<Integer, String> hashMap = new HashMap<>();
        // Adding elements to the HashMap
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        // Retrieving elements from the HashMap
        for (Integer key : hashMap.keySet()) {
            String value = hashMap.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());


        }

    }
}