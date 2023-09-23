/*
 * Escreva um programa que lê dois valores booleanos (lógicos) e então determina se
 * ambos são VERDADEIROS ou FALSOS.
 */

import java.util.Scanner;
public class Atvd_7 {
public static void main(String[] args){
    
    boolean valor1, valor2;
    Scanner dados;
    dados = new Scanner(System.in);
    
    System.out.println("Digite um valor booleano: (True/False)");
    valor1 = dados.nextBoolean();
    
    System.out.println("Digite outro valor em booleano: (True/False)");
    valor2 = dados.nextBoolean();
    
    if(valor1 && valor2){
        System.out.print("Ambos são verdadeiros");
    }
    else if (!valor1 && !valor2){
        System.out.print("Ambos são falsos");
    }
    else{
        System.out.print("Um valor é verdadeiro e o outro é falso");
    }
    }  
}
