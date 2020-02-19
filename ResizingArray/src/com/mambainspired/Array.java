package com.mambainspired;

public class Array {

    int length;
    int[] num_array = new int[length];

    // Constructor
    public Array(int length){
        this.length = length;
    }

    public void insert(int item) {
        int[] new_array = new int[this.num_array.length + 1];
        for (int i = 0; i < this.num_array.length; i++) {
            new_array[i] = this.num_array[i];
        }
        new_array[new_array.length - 1] = item;
        this.num_array = new_array;
    }

    public void print() {
        for (int i = 0; i < this.num_array.length; i++) {
            System.out.println(this.num_array[i]);
        }
    }

    public void removeAt(int index) throws IllegalAccessException {
        if (index < 0 || index > this.num_array.length - 1)
            throw new IllegalAccessException();

        int[] new_array = new int[this.num_array.length - 1];
        int j = 0;
        for (int i = 0; i < new_array.length; i++) {
            if (i != index) {
                new_array[i] = this.num_array[j];
                j++;
            }
            else {
                j = j + 1;
                new_array[i] = this.num_array[j];
                j++;
            }

        }
        this.num_array = new_array;
    }
}
