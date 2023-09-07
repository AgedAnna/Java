import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {
        /*
         * Faça um programa que leia um vetor com quinze posições para números inteiros.
         * Crie, a seguir, um vetor resultante que contenha todos os números primos do
         * vetor
         * digitado. Escreva o vetor resultante.
         */

        int resp;
        Scanner dados = new Scanner(System.in);
        int[] a = new int[15];
        int[] primos = new int[15];

        System.out.println("Digite 15 números: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = resp = dados.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] / 2 == 0) {
                primos[i] = a[i];
            }
        }

        for (int i = 0; i < primos.length; i++) {
            System.out.println(primos[i] + " ");
        }

    }
}
