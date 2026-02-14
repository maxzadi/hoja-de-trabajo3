package com.template;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.err.println("\nMenu:");
            System.err.println("1. Guardar nuevo archivo");
            System.err.println("2. Ordenar datos del archivo");
            System.err.println("3. Salir");

            int numero = sc.nextInt();

            if (numero == 1) {

                int cantidad;
                while (true) {
                    System.err.println("\n¿Cuántos números (1 -> 3000)?");
                    cantidad = sc.nextInt();
                    if (cantidad < 1 || cantidad > 3000) continue;

                    Archivotxt nuevo = new Archivotxt(cantidad);
                    System.err.println("Archivo creado");
                    break;
                }

            } else if (numero == 2) {

                Archivotxt archivo = new Archivotxt();
                int[] arrayOriginal = archivo.leer();

                System.err.println("\nSeleccione el algoritmo de ordenamiento:");
                System.err.println("1. Gnome Sort");
                System.err.println("2. Merge Sort");
                System.err.println("3. Quick Sort");
                System.err.println("4. Counting Sort");
                System.err.println("5. Radix Sort");

                int opcionSort = sc.nextInt();

                switch (opcionSort) {

                    case 1: {
                        int[] gnomeArray = arrayOriginal.clone();
                        GnomeSort gnome = new GnomeSort(gnomeArray);
                        gnome.sort();
                        archivo.guardarOrdenado(gnomeArray, "GnomeSort");
                        break;
                    }

                    case 2: {
                        int[] mergeArray = arrayOriginal.clone();
                        MergeSort merge = new MergeSort(mergeArray);
                        merge.sort(mergeArray, 0, mergeArray.length - 1);
                        archivo.guardarOrdenado(mergeArray, "MergeSort");
                        break;
                    }

                    case 3: {
                        int[] quickArray = arrayOriginal.clone();
                        QuickSort quick = new QuickSort(quickArray);
                        quick.sort();
                        archivo.guardarOrdenado(quickArray, "QuickSort");
                        break;
                    }

                    case 4: {
                        int[] countingArray = arrayOriginal.clone();
                        CountingSort counting = new CountingSort(countingArray);
                        counting.sort();
                        archivo.guardarOrdenado(countingArray, "CountingSort");
                        break;
                    }

                    case 5: {
                        int[] radixArray = arrayOriginal.clone();
                        RadixSort radix = new RadixSort(radixArray);
                        radix.sort();
                        archivo.guardarOrdenado(radixArray, "RadixSort");
                        break;
                    }

                    default:
                        System.err.println("Opción inválida");
                }

                System.err.println("Proceso de ordenamiento finalizado");

            } else {
                break;
            }
        }

        sc.close();
    }
}
