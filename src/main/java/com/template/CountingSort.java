package com.template;

public class CountingSort {

    int[] array;

    public CountingSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        if (array.length == 0) return;

        int max = array[0];
        for (int n : array) {
            if (n > max) max = n;
        }

        int[] conteo = new int[max + 1];

        for (int n : array) {
            conteo[n]++;
        }

        int index = 0;
        for (int i = 0; i < conteo.length; i++) {
            while (conteo[i] > 0) {
                array[index++] = i;
                conteo[i]--;
            }
        }
    }
}
