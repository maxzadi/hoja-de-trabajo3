package com.template;

import org.junit.jupiter.api.Test;

import com.template.GnomeSort;
import com.template.Main;
import com.template.MergeSort;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class QuickTest {
    @Test
    @DisplayName("arreglo desordenado")
    public void testOrdenamientoBasico() {
        int[] datos = {6, 10, 14, 4, 10, 2, 1, 7, 12};
        MergeSort merge = new MergeSort(datos);

        merge.sort(datos, 0, datos.length - 1);

        int[] esperado = {1, 2, 4, 6, 7, 10, 10, 12, 14};
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
