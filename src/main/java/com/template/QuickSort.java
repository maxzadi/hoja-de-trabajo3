package com.template;

public class QuickSort {

    int[] array;

    public QuickSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        quicksort(0, array.length - 1);
    }

    private void quicksort(int menor, int mayor) {
        if (menor < mayor) {
            int pi = dividir(menor, mayor);

            quicksort(menor, pi - 1);
            quicksort(pi + 1, mayor);
        }
    }

    private int dividir(int menor, int mayor) {
        int pivot = array[mayor];
        int i = menor - 1;

        for (int j = menor; j < mayor; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(i, j);
            }
        }

        swap(i + 1, mayor);
        return i + 1;
    }

    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
