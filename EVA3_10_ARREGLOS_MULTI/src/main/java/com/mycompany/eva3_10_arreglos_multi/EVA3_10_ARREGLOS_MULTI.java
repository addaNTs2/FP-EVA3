/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_10_arreglos_multi;

/**
 *
 * @author Angel
 */
public class EVA3_10_ARREGLOS_MULTI {

    public static void main(String[] args) {
        int[][][][][] algo = new int[3][3][3][3][3];
        
        System.out.println(algo.length);             // Dimensión 1
        System.out.println(algo[1].length);          // Dimensión 2
        System.out.println(algo[1][2].length);       // Dimensión 3
        System.out.println(algo[1][2][3].length);    // Dimensión 4
        System.out.println(algo[1][3][2].length);    // Dimensión 5

        for (int i = 0; i < algo.length; i++) {
            for (int j = 0; j < algo[i].length; j++) {
                for (int k = 0; k < algo[i][j].length; k++) {
                    for (int l = 0; l < algo[i][j][k].length; l++) {
                        for (int m = 0; m < algo[i][j][k][l].length; m++) {
                        }
                    }
                }
            }
        }
    }
}
