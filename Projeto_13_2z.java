/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_13_2z;

/**
 *
 * @author wpass
 */
import java.util.Scanner;
public class Projeto_13_2z {

    public static void main(String[] args) {
        int []vetor;
        vetor = new int[101];
        
        for (int i = 100; i >= 0; i--) {
            vetor[i] = i;
        }
        
        for (int i = 100; i >= 0; i--) { 
            System.out.println(vetor[i]);
        }
    }
}
