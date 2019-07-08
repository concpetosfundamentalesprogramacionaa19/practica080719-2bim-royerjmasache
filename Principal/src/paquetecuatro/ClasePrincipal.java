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
public class ClasePrincipal {
    public static void main(String[] args) {
        // Importación del método
        int potencia = Potencia.obtenerPotencia(2, 4);
        // Presentación de resultados
        System.out.printf("Potencia = %d\n", potencia);
    }
}
