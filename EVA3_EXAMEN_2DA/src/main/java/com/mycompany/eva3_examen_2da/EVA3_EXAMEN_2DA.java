/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_examen_2da;

import java.util.Scanner;
/**
 *
 * @author Angel
 */
public class EVA3_EXAMEN_2DA {

    public static void main(String[] args) {
        int jugadaUsu;
        do {
            jugadaUsu = capturarJugada("Introduce tu jugada (1 = piedra, 2 = papel, 3 = tijera, 0 = salir): ");
            if (jugadaUsu != 0) { // Llamar a generarJugadaComp solo si jugadaUsu no es 0
                int jugadaComp = generarJugadaComp();
                System.out.println("Jugada de la computadora: " + jugadaComp);
                
                int resultado = evaluarJugadas(jugadaUsu, jugadaComp);
                if (resultado == 0) {
                    System.out.println("Empate.");
                } else if (resultado == 1) {
                    System.out.println("¡Ganaste!");
                } else {
                    System.out.println("Perdiste.");
                }
            }
        } while (jugadaUsu != 0); // Mientras no quiera salir (Opcion 0)
    }

    // PEDIR LOS DATOS AL USUARIO
    public static int capturarJugada(String mensaje) {
        Scanner captura = new Scanner(System.in);
        System.out.println(mensaje);
        int resu = captura.nextInt();
        return resu;
    }

    // GENERAR JUGADA DE LA COMPUTADORA
    public static int generarJugadaComp() {
        int resu;
        double valor = Math.random();
        if (valor >= 0 && valor < 0.3)
            resu = 1; // Piedra
        else if (valor >= 0.3 && valor < 0.6)
            resu = 2; // Papel
        else
            resu = 3; // Tijera
        return resu;
    }

    // EVALUAR JUGADA: 0-Empate, 1-Gano, 2-Perdio
    public static int evaluarJugadas(int jugadaU, int jugadaC) {
        int resu;
        if (jugadaU == jugadaC) {
            resu = 0; // Empate
        } else if ((jugadaU == 1 && jugadaC == 3) || // Piedra vence Tijera
                   (jugadaU == 2 && jugadaC == 1) || // Papel vence Piedra
                   (jugadaU == 3 && jugadaC == 2)) { // Tijera vence Papel
            resu = 1; // Gano
        } else {
            resu = 2; // Perdio
        }
        return resu;
    }
}
