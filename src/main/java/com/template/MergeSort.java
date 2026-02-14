package com.template;

public class MergeSort {
    int[] array;
    public MergeSort(int[] array){
        this.array=array;
    }

    public void sort(int lista[], int a, int b){
        
        if (a < b) {

            int m = a + (b - a) / 2;

            sort(lista, a, m);
            sort(lista, m + 1, b);

            merge(lista, a, m, b);
        }
    }

    static void merge(int lista[], int a, int m, int b){
        
        int n1 = m - a + 1;
        int n2 = b - m;

        int A[] = new int[n1];
        int B[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            A[i] = lista[a + i];
        for (int j = 0; j < n2; ++j)
            B[j] = lista[m + 1 + j];

        
        int i = 0, j = 0;

        int k = a;
        while (i < n1 && j < n2) {
            if (A[i] <= B[j]) {
                lista[k] = A[i];
                i++;
            }
            else {
                lista[k] = B[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            lista[k] = A[i];
            i++;
            k++;
        }

        while (j < n2) {
            lista[k] = B[j];
            j++;
            k++;
        }
    }
}