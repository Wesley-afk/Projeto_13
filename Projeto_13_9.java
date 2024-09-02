/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_13_9;

/**
 *
 * @author wpass
 */
import java.util.Scanner;
public class Projeto_13_9 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int vetor[];
         vetor = new int[20];
        
        int maior = 0;
        
          System.out.println("Digite numeros para o vetor. \n");
        
          for(int j = 0; j < 20; j++){
            for (int i = 0; i < 20; i++) {
             vetor[i] = ler.nextInt(); 
                
               if(vetor[i] < vetor[j]){
                   maior = vetor[i];
               }
               else{
                   maior = vetor[j];
               }
              
             if(vetor[i] < 0){
                System.out.println("Tente novamente. Digite apenas numeros inteiros.");
                 i = i - 1;
             }            
        }
     }
           System.out.println("O maior indice é: " + maior);
   }
}
