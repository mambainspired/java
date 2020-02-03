package com.kalsden;

public class PrintCharacter implements Runnable {
    private int times;
    private char character;

    public PrintCharacter(int number_of_times, char char_to_print) {
        this.times = number_of_times;
        this.character = char_to_print;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.print(character);
        }
    }
}
