package com.mambainspired;

public class PrintNumber implements Runnable {
    private int max_num;

    public PrintNumber(int max) {
        this.max_num = max;
    }

    @Override
    public void run() {
        for (int i = 1; i <= max_num; i++) {
            System.out.print(" " + i);
        }
    }
}
