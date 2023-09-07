public class atv2 {
    public static void main(String[] args) {
        /*
         * Ler dois vetores A e B com 20 elementos numéricos inteiros. Construir um
         * vetor C,
         * sendo cada elemento de C a subtração do elemento correspondente de A com B.
         * Apresentar os elementos do vetor C.
         */

        int[] A = { 10, 11, 12, 13, 14, 15, 76, 98, 18, 19, 74, 21, 98, 65, 24, 11, 36, 69, 28 };
        int[] B = { 1, 10, 5, 9, 15, 28, 7, 8, 9, 13, 11, 11, 13, 14, 15, 65, 17, 18, 19, 2 };
        int[] C = new int[20];

        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] - B[i];
        }

        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }

    }
}
