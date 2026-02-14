package com.template;

public class GnomeSort {
    int[] array;
    public GnomeSort(int[] array){
        this.array=array;
    }

    public void sort(){
        int i = 0;
        int n = array.length;

        while (i < n) {
            if (i == 0 || array[i] >= array[i - 1]) i++;
            else {
                swap(array, i, i-1);
                i--;
            }
        }
        return;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp; 
    }
}