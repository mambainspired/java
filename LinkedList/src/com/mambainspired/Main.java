package com.mambainspired;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        LinkedList list = new LinkedList();

        Student s1 = new Student("Kalyan", "Chatterjee", "123456", "Software Engineering");
        Student s2 = new Student("John", "Smith", "123457", "Software Engineering");

        list.insert(list, s1);
        list.insert(list, s2);

        list.printList(list);
    }
}
