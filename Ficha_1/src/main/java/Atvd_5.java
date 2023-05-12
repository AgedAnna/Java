/*
 * Faça um programa que leia uma variável e some 5 caso seja par ou some 8 caso
   seja ímpar. Imprimir o resultado desta operação.
 * 
 */

import java.util.Scanner;
public class Atvd_5 {
public static void main(String[] args){
    
int x, soma;
Scanner dados;
dados= new Scanner(System.in);

System.out.print("Digite um número: ");
x=dados.nextInt();

if (x%2==0){
    soma=x+5;
    System.out.print(+soma);
}

else{
    soma=x+8;
    System.out.print(+soma);
}
       
}}
