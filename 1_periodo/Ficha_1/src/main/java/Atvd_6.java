/*
 * 6) Escreva um programa que leia três valores inteiros e diferentes e 
 *    mostre-os e ordem crescente.
 * 
 */

import java.util.Scanner;
public class Atvd_6 {
public static void main(String[] args){
    
    int n1, n2, n3;
    Scanner dados;
    dados = new Scanner(System.in);
    
    System.out.println("Digite um número: ");
    n1 = dados.nextInt();
    
    System.out.println("Digite um número: ");
    n2 = dados.nextInt();
    
    System.out.println("Digite um número: ");
    n3 = dados.nextInt();
    
    
    if (n1<n2 && n1<n3 && n2<n3){
        System.out.print(n1+""+n2+""+n3);
    }
    
    else if (n2<n1 && n2<n3 && n1<n3){
     System.out.print(n2+""+n1+""+n3);
    }
    
    else if (n3<n1 && n3<n2 && n2<n1){
     System.out.print(n3+""+n2+""+n1);
    }
    
    else{
     System.out.print(n3+""+n1+""+n2);
    }
    
    }
}

