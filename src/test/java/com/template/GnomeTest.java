package com.template;

import org.junit.jupiter.api.Test;

import com.template.GnomeSort;
import com.template.Main;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;


public class GnomeTest {
    @Test
    @DisplayName("arreglo desordenado")
    public void testOrdenamientoBasico() {
        int[] datos = {5, 3, 6, 12, 8, 1, 2};
        GnomeSort gnome = new GnomeSort(datos);

        gnome.sort();

        int[] esperado = {1, 2, 3, 5, 6, 8, 12};
        assertArrayEquals(esperado, datos);
    }

    @Test
    @DisplayName("arreglo ya ordenado")
    public void testArregloYaOrdenado() {
        int[] datos = {1, 2, 3, 4, 5};
        GnomeSort gnome = new GnomeSort(datos);

        gnome.sort();

        int[] esperado = {1, 2, 3, 4, 5};
        assertArrayEquals(esperado, datos);
    }
}
