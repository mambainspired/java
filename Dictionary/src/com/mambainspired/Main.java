package com.mambainspired;
import java.util.HashMap;
import java.io.File;

/**
 * A simple Java class to implement a key-value data structure
 */

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> myDictionary = new HashMap<String, String>();
        // Read JSON file
        File dictionaryJSON = new File("dictionary.json");
//        if (dictionaryJSON.canRead()){
//            System.out.println("Dictionary object available");
//        } else {
//            System.out.println("Can't read dictionary");
//        }
        System.out.println(dictionaryJSON.getAbsolutePath());

        myDictionary.put("abysmal", "appalling");
        myDictionary.put("acumen", "insightfulness: shrewdness shown by keen insight");
        System.out.println(myDictionary);
        System.out.println(myDictionary.get("acumen"));
    }
}
