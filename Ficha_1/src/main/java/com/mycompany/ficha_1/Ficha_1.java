/*
 * Faça um programa para receber um número inteiro qualquer e informar na tela 
   se é parou ímpar.
 */

package com.mycompany.ficha_1;
import java.util.Scanner;
public class Ficha_1 {

   public static void main(String[] args) {
       
        int n1;
        Scanner numero;
        numero = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        n1 = numero.nextInt();
        
        if (n1%2==0){
            System.out.print("Par");
        }
        
        else{
            System.out.print("Ímapar");
        }
    }
}
