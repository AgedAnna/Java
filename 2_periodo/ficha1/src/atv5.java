public class atv5 {
    public static void main(String[] args) {
        /*
         * Ler 20 elementos numéricos inteiros para um vetor A e construir um vetor B de
         * mesma dimensão com os mesmos elementos de A. Eles devem estar invertidos, ou
         * seja, o primeiro elemento de A passa a ser o último de B, o segundo elemento
         * de A
         * passa a ser o penúltimo de B, e assim por diante. Apresentar os elementos dos
         * dois
         * vetores.
         */

        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int[] b = new int[20];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];
        }

        System.out.println("Vetor original: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor invertido: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
