/*
 *Faça um programa que leia dois valores inteiros A e B se os valores forem iguais
deverá se somar os dois, caso contrário multiplique A por B. Ao final de qualquer
um dos cálculos deve-se atribuir o resultado para uma variável C e mostrar seu
conteúdo na tela.
 * 
 */

import java.util.Scanner;
public class Atv_3 {
public static void main(String[] args) {
    
    int n1,n2,c;
    Scanner numeros;
    numeros = new Scanner(System.in);
    
    System.out.println("Digite um número: ");
    n1=numeros.nextInt();
    
    System.out.println("Digite outro número: ");
    n2=numeros.nextInt();
    
    if (n1==n2){
      c = n1+n2;
      System.out.println(+c);
    }
    
    else{
    c=n1*n2;
    System.out.print(c);
    }
    
    }   
}
