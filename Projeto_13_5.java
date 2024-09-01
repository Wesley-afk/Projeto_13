/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_13_5;

/**
 *
 * @author wpass
 */
import java.util.Scanner;
public class Projeto_13_5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float []array;
        array = new float[11];
        
        for (int i = 0; i < 10; i++) {
           System.out.println("Digite um numero.");
              array[i] = ler.nextFloat();
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Metade de: " + array[i] + "  =  " + (array[i] / 2) + "\n");
        }
    }
}
