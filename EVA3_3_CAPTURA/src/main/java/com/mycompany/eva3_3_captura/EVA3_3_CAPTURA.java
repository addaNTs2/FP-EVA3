/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_captura;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class EVA3_3_CAPTURA {

    public static void main(String[] args) {
        String nombre = capturarTexto("Introduce tu nombre: ");
        String apellidos = capturarTexto("Introduce tus apellidos: ");
        int edad = capturarEdad("Introduce tu edad: ");
        double cant = capturarSalario("Introduce tu salario: ");
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellidos);    
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + cant);
    }
    
    // CAPTURAR TEXTO
    public static String capturarTexto(String mensaje){
        Scanner captura = new Scanner(System.in);
        System.out.println(mensaje);
        String texto = captura.nextLine();
        return texto;
    }

    // MÉTODO PARA CAPTURAR ENTEROS (LO USAREMOS PARA LA EDAD)
    public static int capturarEdad(String mensaje){
        Scanner captura = new Scanner(System.in);
        System.out.println(mensaje);
        int numero = captura.nextInt();
        return numero;
    }

    // MÉTODO PARA CAPTURAR DOUBLES (CAPTURAR EL SALARIO)
    public static double capturarSalario(String mensaje){
        Scanner captura = new Scanner(System.in);
        System.out.println(mensaje);
        double cant = captura.nextDouble();
        return cant;
    }
}
