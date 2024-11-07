/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_metodos_arreglos;

/**
 *
 * @author Angel
 */
public class EVA3_METODOS_ARREGLOS {

    public static void main(String[] args) {
        String diaSemana[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        
        // Llamar al método para imprimir el arreglo
        imprimirArreglo(diaSemana);

        String meses[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre",
        "Octubre","Noviembre","Diciembre"};
        imprimirArreglo(meses);

        int billetes[] = {10, 50, 100, 200, 500, 1000};
        imprimirBilletes(billetes);
    }

    // Imprimir arreglo de cadenas
    public static void imprimirArreglo(String[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

    // Imprimir arreglo de enteros
    public static void imprimirBilletes(int[] arregloB) {
        for (int i = 0; i < arregloB.length; i++) {
            System.out.println(arregloB[i]);
        }
    }
}
