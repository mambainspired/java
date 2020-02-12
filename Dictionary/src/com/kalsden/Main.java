package com.kalsden;
import java.util.HashMap;

/**
 * A simple Java class to implement a key-value data structure
 */

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> myDictionary = new HashMap<String, String>();
        myDictionary.put("abysmal", "appalling");
        myDictionary.put("acumen", "insightfulness: shrewdness shown by keen insight");
        System.out.println(myDictionary);
        System.out.println(myDictionary.get("acumen"));
    }
}
