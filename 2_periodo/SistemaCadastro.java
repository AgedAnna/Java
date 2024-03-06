/*
Exercícios:
1. Construir e exbir uma lista com 5 funcionários 
2. Pesquisar um funcionário pelo nome. Apresentar os dados do funcionario.
3. Ordenar pelo nome a lista de funcionários a partir do exercício 1.
*/

package sistemacadastro;

import java.util.Scanner;

public class SistemaCadastro {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int nf = 5; // número de funcionários

    //declaração do vetor de funcionários
    Funcionario[] f;
    f = new Funcionario[nf];

    //laço para cadastrar os funcionários
    for (int i = 0; i < nf; i++) {
      System.out.println("Digite nome do " + (i + 1) + "o funcionario: ");
      String n = s.nextLine();
      System.out.println("Digite salario do " + (i + 1) + "o funcionario: ");
      double sal = s.nextDouble();
      f[i] = new Funcionario();
      f[i].nome = n;
      f[i].salario = sal;
      s.nextLine();
    }

    //exibe a lista de funcionários
    System.out.println("\nLista de Funcionarios");
    exibeFuncionario(f);
    procuraFuncionario(f, "Anna");
    selecaoDireta(f);
  }

  public static void exibeFuncionario(Funcionario[] f) {
    for (int i = 0; i < f.length; i++) {
      System.out.print("Nome: " + f[i].nome);
      System.out.println(" Salario: R$ " + f[i].salario);
    }
  }

  public static void procuraFuncionario(Funcionario[] f, String nome) {
    String nomeF;
    for (int i = 0; i < f.length; i++) {
      nomeF = f[i].nome;
      if (nome.compareTo(nomeF) == 0) {
        System.out.println("A pessoa é: " + nomeF + " ela está no cadastro");
        break;
      } else {
        System.out.println("Pessoal não encontrada");
        break;
      }
    }
  }

  public static int[] selecaoDireta(Funcionario[] f, String nome) {
    String nomeF;
    for (int i = 0; i < f.length - 1; i++) {
      nomeF = f[i].nome;
      for (int j = i + 1; j <= f.length - 1; j++) {
        if (nome.compareTo(nomeF)==0) {
          nome = nomeF;
        }
      }
      nomeF = f[i].nome;
      f[i].nome = f[nomeF];
      f[nomeF] = nome;
    }
    return (f);
  }
}
