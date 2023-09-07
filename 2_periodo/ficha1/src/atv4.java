public class atv4 {
    public static void main(String[] args) {
        /*
         * Ler 15 elementos numéricos inteiros de um vetor A. Construir um vetor B de
         * mesmo
         * tipo, observando a seguinte lei de formação: todo elemento do vetor B deve
         * ser o
         * quadrado do elemento correspondente do vetor A. Apresentar os elementos dos
         * vetores A e B dispostos lado a lado.
         */

        int[] a = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
        int[] b = new int[15];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] * a[i];
        }

        System.out.println("O quadrado desses números consecutivamente são:" );

        for (int i = 0; i < b.length; i++) {
            System.out.print(a[i] + " = ");
            System.out.print(b[i] + " ; ");
        }
    }
}
