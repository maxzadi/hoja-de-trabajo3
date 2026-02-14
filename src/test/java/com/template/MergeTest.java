package com.template;

import org.junit.jupiter.api.Test;

import com.template.GnomeSort;
import com.template.Main;
import com.template.MergeSort;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class MergeTest {
    @Test
    @DisplayName("arreglo desordenado")
    public void testOrdenamientoBasico() {
        int[] datos = {9, 2, 7, 1, 6, 9, 2, 2, 5};
        MergeSort merge = new MergeSort(datos);

        merge.sort(datos, 0, datos.length - 1);

        int[] esperado = {1, 2, 2, 2, 5, 6, 7, 9, 9};
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
