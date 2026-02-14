package com.template;

public class RadixSort {

    int[] array;

    public RadixSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        if (array.length == 0) return;

        int max = getMax();

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortByDigit(exp);
        }
    }

    private int getMax() {
        int max = array[0];
        for (int n : array) {
            if (n > max) max = n;
        }
        return max;
    }

    private void countingSortByDigit(int exp) {
        int n = array.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            int digit = (array[i] / exp) % 10;
            count[digit]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int digit = (array[i] / exp) % 10;
            output[count[digit] - 1] = array[i];
            count[digit]--;
        }

        for (int i = 0; i < n; i++) {
            array[i] = output[i];
        }
    }
}
