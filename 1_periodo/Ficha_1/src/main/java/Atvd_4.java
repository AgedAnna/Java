/*
 * Faça um programa para encontrar o dobro de um número caso ele seja positivo 
   e o seu triplo caso seja negativo, imprimindo o resultado.
 * 
 */

import java.util.Scanner;
public class Atvd_4 {
public static void main(String[] args) {
    
    float x,cont;
    Scanner num;
    num=new Scanner(System.in);
    
    System.out.print("Digite um número: ");
    x=num.nextFloat();
    
    if (x<0){
    cont=x*3;
    System.out.print(cont);       
    }
    
    else{
    cont=x*2;
    System.out.print(cont);
    }
    
    
   }    
}
