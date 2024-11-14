/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8_arreglos_multi;

/**
 *
 * @author Angel
 */
public class EVA3_8_ARREGLOS_MULTI {

    public static void main(String[] args) {
        int[][][] cubo = new int[2][5][3];
        for (int i = 0; i < 2; i++) { //PRIMERA DIMENSION
            for (int j = 0; j < 5; j++) { //SEGUNDA DIMENSION
                for (int k = 0; k < 3; k++) { //TERCERA DIMENSION
                    cubo[i][j][k] = (int)(Math.random() * 100);
                    
                }
                
            }
            
        }
        //IMPRIMIR VALORES
        for (int i = 0; i < 2; i++) { //PRIMERA DIMENSION
            for (int j = 0; j < 5; j++) { //SEGUNDA DIMENSION
                for (int k = 0; k < 3; k++) { //TERCERA DIMENSION
                    cubo[i][j][k] = (int)(Math.random() * 100);
                    System.out.print("[" + cubo[i][j][k] + "]");
    }
}
        }
    }
}
