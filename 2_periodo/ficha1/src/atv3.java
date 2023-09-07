public class atv3 {
    public static void main(String[] args) {

        /*
         * Ler dois vetores A com cinco elementos e B com dez elementos (valores
         * numéricos
         * inteiros). Construir um vetor C, que é a junção dos dois outros vetores.
         * Dessa forma,
         * C deve ter a capacidade de armazenar 15 elementos. Apresentar os elementos do
         * vetor C.
         */

        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int[] c = new int[15];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }

    }
}