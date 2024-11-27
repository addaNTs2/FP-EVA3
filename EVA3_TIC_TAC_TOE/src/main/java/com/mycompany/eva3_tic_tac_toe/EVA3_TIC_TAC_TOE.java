/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_tic_tac_toe;

import java.util.Scanner;

/**
 *
 * @author Angel
 */




public class EVA3_TIC_TAC_TOE {

    public static void main(String[] args) {
        int[][] tabla = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        }; // 0 = vacío, 1 = jugador, 2 = computadora
        Scanner captura = new Scanner(System.in);

        System.out.println("Hola, vamos a jugar al tic tac toe");
        System.out.println("Eres el jugador '1' (X). La computadora es '2' (O).");

        for (int turnos = 0; turnos < 9; turnos++) {
            if (turnos % 2 == 0) {
                // Turno del jugador
                boolean jugadaValida = false;
                while (!jugadaValida) {
                    System.out.println("Tu turno. Introduce fila y columna (0-2):");
                    System.out.print("Fila: ");
                    int fila = captura.nextInt();
                    System.out.print("Columna: ");
                    int columna = captura.nextInt();

                    if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tabla[fila][columna] == 0) {
                        tabla[fila][columna] = 1;
                        jugadaValida = true;
                    } else {
                        System.out.println("Posicion invalida. Intenta nuevamente.");
                    }
                }
            } else {
                // Turno de la computadora (básico)
                boolean jugadaValida = false;
                for (int i = 0; i < 3 && !jugadaValida; i++) {
                    for (int j = 0; j < 3 && !jugadaValida; j++) {
                        if (tabla[i][j] == 0) {
                            tabla[i][j] = 2;
                            jugadaValida = true;
                            System.out.println("La computadora eligio: Fila " + i + ", Columna " + j);
                        }
                    }
                }
            }

            // Mostrar el tablero
            mostrarTablero(tabla);

            // Verificar si hay ganador
            int ganador = verificarGanador(tabla);
            if (ganador != 0) {
                if (ganador == 1) {
                    System.out.println("Has ganado");
                } else {
                    System.out.println("La computadora ha ganado");
                }
                return;
            }
        }

        System.out.println("Empate.");
    }

    public static void mostrarTablero(int[][] tabla) {
        System.out.println("Tablero actual:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabla[i][j] == 0) {
                    System.out.print("- ");
                } else if (tabla[i][j] == 1) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }

    public static int verificarGanador(int[][] tabla) {
        // Revisar filas y columnas
        for (int i = 0; i < 3; i++) {
            if (tabla[i][0] == tabla[i][1] && tabla[i][1] == tabla[i][2] && tabla[i][0] != 0) {
                return tabla[i][0];
            }
            if (tabla[0][i] == tabla[1][i] && tabla[1][i] == tabla[2][i] && tabla[0][i] != 0) {
                return tabla[0][i];
            }
        }

        // Revisar diagonales
        if (tabla[0][0] == tabla[1][1] && tabla[1][1] == tabla[2][2] && tabla[0][0] != 0) {
            return tabla[0][0];
        }
        if (tabla[0][2] == tabla[1][1] && tabla[1][1] == tabla[2][0] && tabla[0][2] != 0) {
            return tabla[0][2];
        }

        return 0; // No hay ganador aún
    }
}
