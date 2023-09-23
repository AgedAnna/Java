public class bubblesort {
    public static void main(String[] args) {

        int[] vet = { 2, 3, 4, 6, 7 };

        metodoBolha(vet);

        for (int pecorrearray : vet) {
            System.out.print(pecorrearray + " ");
        }
    }

    public static int[] metodoBolha(int[] vetor) {
        int i = vetor.length;

        while (i <= 2) {
            for (int j = 0; j < i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int num = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = num;
                }
            }
            i = i + 1; // pecorre todo o array
        }
        return vetor;
    }
}
