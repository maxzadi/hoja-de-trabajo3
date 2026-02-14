package com.template;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        System.err.println("Menu:");
        System.err.println("1. Guardar nuevo archivo");
        System.err.println("2. Ordenar datos del archivo");
        System.err.println("3. Salir");
        int numero = sc.nextInt();
        if(numero==1){
            int cantidad;
            while (true) {
                System.err.println("\n\n¿Cuantos números(1->3000)?");
                cantidad = sc.nextInt();
                if(cantidad<1 || cantidad>3000){continue;}
                Archivotxt nuevo = new Archivotxt(cantidad);
                System.err.println("Archivo creado");
                break;
            }
        }else if(numero==2){
                Archivotxt archivo = new Archivotxt();
                int[] array = archivo.leer();
        }else{
            break;
        }
        }
    }

}