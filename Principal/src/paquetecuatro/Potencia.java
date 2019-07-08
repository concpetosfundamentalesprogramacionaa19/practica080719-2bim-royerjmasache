/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecuatro;

/**
 *
 * @author royerjmasache
 */
public class Potencia {
    public static int obtenerPotencia(int b, int e){
        // Estructura condicional anidada para evaluar la condición
        if(e == 1){
            // Retorno de variable
            return b;
        } else {
            // Retorno de variable
            return b * obtenerPotencia(b, e - 1);
        }
    }
}
