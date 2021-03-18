package com.javahw;

import java.util.Arrays;

public class IntList {
    private int[] arr = new int[0];

    public void add(int value) {
        int[] tmpArr = new int[this.arr.length + 1];
        System.arraycopy(this.arr, 0, tmpArr, 0, this.arr.length);
        tmpArr[this.arr.length] = value;
        this.arr = tmpArr;
    }

    public int get(int index) {
        return this.arr[index];
    }

    public void set(int index, int value) {
        this.arr[index] = value;
    }

    public int size() {
        return this.arr.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.arr);
    }
}
