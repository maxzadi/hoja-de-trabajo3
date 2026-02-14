package com.template;

import org.junit.jupiter.api.Test;

import com.template.GnomeSort;
import com.template.Main;
import com.template.MergeSort;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class CountingTest {
    @Test
    @DisplayName("arreglo desordenado")
    public void testOrdenamientoBasico() {
        int[] datos = {3, 8, 2, 14, 15, 11, 15, 6};
        MergeSort merge = new MergeSort(datos);

        merge.sort(datos, 0, datos.length - 1);

        int[] esperado = {2, 3, 6, 8, 11, 14, 15, 15};
        assertArrayEquals(esperado, datos);
    }

    @Test
    @DisplayName("arreglo ordenado")
    public void testArregloYaOrdenado() {
        int[] datos = {1, 2, 3, 4, 5};
        MergeSort merge = new MergeSort(datos);

        merge.sort(datos, 0, datos.length - 1);

        int[] esperado = {1, 2, 3, 4, 5};
        assertArrayEquals(esperado, datos);
    }
}
