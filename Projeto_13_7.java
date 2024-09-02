/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_13_7;

/**
 *
 * @author wpass
 */
import java.util.Scanner;
public class Projeto_13_7 {

    public static void main(String[] args) {
     Scanner ler = new Scanner (System.in);
     
        String []nomes;
        nomes = new String[10];
        String nome = "";
        int verificador = 0;
        
        System.out.println("Digite um nome: \n");
          for (int i = 0; i < 10; i++) {
          nomes[i] = ler.nextLine();
          }
          
        System.out.println("Digite mais um nome.");
         nome = ler.nextLine();
          
        for (int i = 0; i < 10; i++) {
            
            if(nome.equals(nomes[i])){
                System.out.println("achei");
            }
             else{
               verificador = verificador + 1;   
            }
      }
        if(verificador == 10){
            System.out.println("Não achei");
        }
    }
}
