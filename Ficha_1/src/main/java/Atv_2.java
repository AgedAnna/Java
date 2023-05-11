/*
 * Escreva um programa que leia os valores A, B, C e imprima na tela se
   a soma de A +B é menor que C.
 * 
 */

import java.util.Scanner;
public class Atv_2 {
public static void main(String[] args) {
         
    float a, b, c;
    Scanner dados;
    dados = new Scanner(System.in);
    
    System.out.print("Digite n1: ");
    a = dados.nextFloat();
    
    System.out.print("Digite n2: ");
    b = dados.nextFloat();  
    
    System.out.print("Digite n3: ");
    c= dados.nextFloat();
    
    if (a+b>c){
    System.out.print("A soma de" +a+ "e" +b+ "é maior que" +c);
    }
    else{
    System.out.println(c+ "é maior que a soma de" +a+ "e" +b);
    }
    }
}
