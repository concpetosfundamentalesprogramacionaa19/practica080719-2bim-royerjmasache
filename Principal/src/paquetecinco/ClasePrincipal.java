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
public class ClasePrincipal {

    public static void main(String[] args) {
        /*
         * Uso de recursividad
         * Declaración e inicialización de arreglo
        */
        int[] arreglo = {10, 20, 30, 1, 2, 3, 40, 4};
        // Declaración del arreglo para almacenar el tamaño
        int arreglot = arreglo.length;
        // Importación del método
        int arreglor = Arreglo.obtenerArreglo(arreglo, arreglot);
        // Presentación de resultados
        System.out.printf("Arreglo en recursividad es = %d\n", arreglor);
        /*
         * Uso de ciclo repetititivo
         * Importación del método
        */
        int arreglof = Arreglo.obtenerArreglo(arreglo, arreglot);
        // Presentación de resultados
        System.out.printf("Arreglo en ciclo repetitivo es = %d\n", arreglof);
    }
}
