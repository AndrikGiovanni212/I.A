/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.i.a;

import java.util.Scanner;

/**
 *
 * @author sepia
 */
public class Ejercicio_0 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] matriz3 = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Escribe un numero para la primera matriz: ");
                System.out.println("");
                matriz[i][j] = scan.nextInt();
            }
        }
        System.out.println("Matriz 2");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Escribe un numero para la segunda matriz: ");
                System.out.println("");
                matriz2[i][j] = (int) scan.nextInt();
            }
        }
        System.out.println("Matriz 1");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("[ " + matriz[i][j] + " ]");
            }
            System.out.println("");
        }
        System.out.println("matriz2");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("[ " + matriz2[i][j] + " ]");
            }
            System.out.println("");
        }

        System.out.println("Suma");
        matriz3 = sumaresta(matriz, matriz2);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("[ " + matriz3[i][j] + " ]");
            }
            System.out.println("");
        }
        System.out.println("Multiplicación");
        matriz3 = multi(matriz, matriz2);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("[ " + matriz3[i][j] + " ]");
            }
            System.out.println("");
        }
    }

    public static int[][] sumaresta(int[][] ma, int[][] ma2) {
        int[][] matriz = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = ma[i][j] + ma2[i][j];

            }
 
        }
        return matriz;
    }

    public static int[][] multi(int[][] ma, int[][] ma2) {
        int[][] matriz = new int[2][2];
        int[][] matriz1 = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = ma[i][0] * ma2[0][j] + ma[i][1] * ma2[1][j];
                /**
                 * [0,0][0,1] [0,0][0,1] , [1,0][1,1] [1,0][1,1]    
                 *
                 */

            }
        }
        return matriz;
    }
}
