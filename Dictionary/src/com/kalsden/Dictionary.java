package com.kalsden;

import java.util.ArrayList;

public class Dictionary {
    ArrayList<Node> list = null;

    public void addToDictionary(String key, String value) {
        Node n = new Node(key, value);
        list.add(n);
    }
    
    public void print(Dictionary dict) {
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.println(list.get(i));
        }

    }
}
