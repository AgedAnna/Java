/*
   Elabore um programa que calcule o que deve ser pago por um produto,
   considerando o preço normal de etiqueta e a escolha da condição de pagamento.
   Utilize os códigos da tabela a seguir para ler qual a condição de pagamento
   escolhida e efetuar o cálculo adequado.
   Código Condição de pagamento
   1 À vista em dinheiro ou pix, recebe 10% de desconto
   2 À vista no cartão de crédito, recebe 5% de desconto
   3 Em duas vezes, preço normal de etiqueta sem juros
   4 Em três vezes, preço normal de etiqueta mais juros de 5%
 */

import java.util.Scanner;
public class Atvd_8 {
public static void main(String[] args){
    
    float valor, resultado; 
    int opcao;
    Scanner dados;
    dados = new Scanner(System.in);
    
    System.out.println("Digite o valor do produto:");
    valor = dados.nextFloat();
    
    System.out.println("Forma de pagamento:");
    System.out.println("(1)À vista em dinheiro ou pix;");
    System.out.println("(2)À vista no cartão de crédito;");
    System.out.println("(3)Em duas vezes no cartão de crédito;");
    System.out.println("(4)Em três vezesa no cartão de crédito;");
    
    System.out.println("Digite a opção desejada:");
    opcao=dados.nextInt();
    
    switch(opcao) {
        case 1 -> {
         resultado = (valor * 10) / 100;
         System.out.println(valor - resultado);
        }
        
        case 2 -> {
         resultado = (valor * 5) / 100;
         System.out.println(valor - resultado);
        }
        
        case 3 -> System.out.println(valor);
            
        case 4 -> {
         resultado = (valor * 5) / 100;
         System.out.println(valor + resultado);
        }
        
        default -> System.out.println("Opção inválida!");
            
        }
    
    
    }    
}
