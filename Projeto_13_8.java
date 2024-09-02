/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_13_8;

import java.util.Scanner;

/**
 *
 * @author wpass
 */
public class Projeto_13_8 {

   public static void main(String[] args) {
     Scanner ler = new Scanner (System.in);
     
     int []turma;
     turma = new int[20];
     
     int media = 0;
     
     int acima_media = 0;
     
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + "\n");
             turma[i] = ler.nextInt();
              media += turma[i];
        }
        
        for (int i = 0; i < 20; i++) {
            if(turma[i] >= 7){
                System.out.println("O aluno " + (i + 1) + " ficou acima da média. ");
                acima_media =  acima_media + 1;
            }
        }
        
        System.out.println("Media da turma: " + (media / 20));
        System.out.println("Quantidade de alunos acima da média: " + acima_media);
    }
}
