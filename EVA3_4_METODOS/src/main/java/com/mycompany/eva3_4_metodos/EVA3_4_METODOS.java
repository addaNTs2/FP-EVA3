/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_4_metodos;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class EVA3_4_METODOS {

    public static void main(String[] args) {
        System.out.println(encontrarMayor(1, 10));
        Scanner captura = new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 7: ");
        int dia = captura.nextInt();
        System.out.println(diaSemana(dia));
    }

    // VALOR MÁS GRANDE ENTRE DOS NÚMEROS ENTEROS
    public static int encontrarMayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    
    // Método que regresa el día de la semana en texto. Pide el número (1 a 7)
    public static String diaSemana(int dia) {
        switch (dia) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miercoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sabado";
            case 7:
                return "Domingo";
            default:
                return "No existe tu dia";
        }
    }
}
