/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_13_4;

/**
 *
 * @author wpass
 */
public class Projeto_13_4 {

  public static void main(String[] args) {
        int []vetor;
        vetor = new int[21];
        
        for (int i = 0; i <= 20; i++) {         
          if(i % 2 != 0){
             vetor[i] = i * i;
               System.out.println(vetor[i]);
            }
        }
    }
}