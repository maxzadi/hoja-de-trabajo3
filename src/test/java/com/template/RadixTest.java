package com.template;

import org.junit.jupiter.api.Test;

import com.template.GnomeSort;
import com.template.Main;
import com.template.MergeSort;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class RadixTest {
    @Test
    @DisplayName("arreglo desordenado")
    public void testOrdenamientoBasico() {
        int[] datos = {12, 9, 8, 4, 2, 2, 3};
        MergeSort merge = new MergeSort(datos);

        merge.sort(datos, 0, datos.length - 1);

        int[] esperado = {2, 2, 3, 4, 8, 9, 12};
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
