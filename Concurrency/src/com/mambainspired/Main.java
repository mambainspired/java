package com.mambainspired;

public class Main {

    public static void main(String[] args) {
	    Runnable printA = new PrintCharacter(100, 'a');
	    Runnable printB = new PrintCharacter(100, 'b');
	    Runnable print100 = new PrintNumber(100);

	    Thread t1 = new Thread(printA); // NEW state
	    Thread t2 = new Thread(printB);
	    Thread t3 = new Thread(print100);

	    t1.start(); // RUNNABLE state - each thread gets its own call stack
	    t2.start();
	    t3.start();

	    String test = "unhappy";

    }
}
