/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecinco;

/**
 *
 * @author royerjmasache
 */
public class Arreglo {
    public static int obtenerArreglo(int a[], int t){
        if(t == 1){
            return a[0];
        } else {
            return a[t - 1] + obtenerArreglo(a, t - 1);
        }
    }
    public static int obtenerArregloDos(int a[], int t){
        int suma = 0;
        for (int i = 0; i < t; i++) {
            suma = suma + a[i];
        }
        return suma;
    }
}
