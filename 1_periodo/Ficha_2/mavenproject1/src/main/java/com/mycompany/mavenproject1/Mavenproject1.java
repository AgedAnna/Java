/*
 * Escreva um programa que leia o número de identificação, as 3 notas obtidas por um
   estudante nas 3 verificações de aprendizagem e a média dos exercícios que fazem
   parte da avaliação. Em seguida, calcule a média de aproveitamento, usando a fórmula
   seguinte:

   MA = (nota1 + 2 ∙ nota2 + 3 ∙ nota3 + ME)/7.

   A atribuição dos conceitos obedece a tabela abaixo:

   Média de aproveitamento Conceito
   Maior ou igual 9,0 e menor ou igual a 10,0 A
   Maior ou igual a 7,5 e menor que 9,0 B
   Maior ou igual a 6,0 e menor que 7,5 C
   Maior ou igual a 4,0 e menor que 6,0 D
   Menor que 4,0 E

   O programa deve escrever: o número de identificação do estudante, suas notas, a média
   dos exercícios, a média de aproveitamento, o conceito correspondente e a mensagem
   ‘Aprovado’se o conceito for A, B ou C, ‘Recuperação’ se o conceito for D e ‘Reprovado’
   se o conceito for E.

 */

package com.mycompany.mavenproject1;
import java.util.Scanner;
public class Mavenproject1 {
public static void main(String[] args) {
        
    float n1, n2, n3, me, ma;
    int matricula;
    Scanner dados;
    dados = new Scanner(System.in);
    
    
    System.out.println("Digite a matrícula do aluno: ");
    matricula = dados.nextInt();
    
    System.out.println("Digite a média dos exercícios: ");
    me = dados.nextFloat();
    
    System.out.println("Digite n1: ");
    n1 = dados.nextFloat();
    
    System.out.println("Digite n2: ");
    n2 = dados.nextFloat();
    
    System.out.println("Digite n3: ");
    n3 = dados.nextFloat();
    
    ma = (n1+2 * n2+3 * n3+me)/7;
    
    if(ma>=9.0 && ma<=10.0){
        System.out.print("O aluno: "+matricula+" tirou essas notas: n1= "+n1+" n2= "+n2+" n3= "+n3+ " Essa foi a média dos exercícios: "+me+" E essa foi a média de aproveitamento: "+ma+" A, APROVADO" );
    }
    
    else if(ma>=7.5 && ma<9.0){
        System.out.print("O aluno: "+matricula+" tirou essas notas: n1= "+n1+" n2= "+n2+" n3= "+n3+ " Essa foi a média dos exercícios: "+me+" E essa foi a média de aproveitamento: "+ma+" B APROVADO");
}
    
    else if (ma>=6.0 && ma<7.5){
        System.out.print("O aluno: "+matricula+" tirou essas notas: n1= "+n1+" n2= "+n2+" n3= "+n3+ " Essa foi a média dos exercícios: "+me+" E essa foi a média de aproveitamento: "+ma+" C APROVADO");
    }
    
    else if (ma>=4.0 && ma<6.0){
        System.out.print("O aluno: "+matricula+" tirou essas notas: n1= "+n1+" n2= "+n2+" n3= "+n3+ " Essa foi a média dos exercícios: "+me+" E essa foi a média de aproveitamento: "+ma+" D RECUPERAÇAO");
}   
    else{
        System.out.print("O aluno: "+matricula+" tirou essas notas: n1= "+n1+" n2= "+n2+" n3= "+n3+ " Essa foi a média dos exercícios: "+me+" E essa foi a média de aproveitamento: "+ma+" E REPROVADO");
    }
    
    }
}