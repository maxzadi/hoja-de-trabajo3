package com.template;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Archivotxt {
    public Archivotxt(int cantidad){
        generar(cantidad);
    }

    public Archivotxt(){
    }

    private void generar(int cantidad) {
        Random random = new Random();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("datos.txt", true))) {
            for(int i=0;i<cantidad;i++){
                
                bw.write(random.nextInt(3000));
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");
        }
    }

    public int[] leer(){
        int cantidad = 0;
        try(BufferedReader br = new BufferedReader(new FileReader("datos.txt"));){
        while (br.readLine() != null) {
            cantidad++;
        }} catch (IOException e){
            System.out.println("Error al leer el archivo");
            int[] x=new int[1];
            return x;
        }

        int[] numeros = new int[cantidad];

        int i = 0;
        try(BufferedReader br = new BufferedReader(new FileReader("datos.txt"));){
        String linea;
        while ((linea = br.readLine()) != null) {
            numeros[i] = Integer.parseInt(linea.trim());
            i++;
        }} catch (IOException e){
            System.out.println("Error al leer el archivo");
            int[] x=new int[1];
            return x;
        }

        return numeros;
    }
}
