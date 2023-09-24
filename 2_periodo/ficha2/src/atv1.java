import java.util.Scanner;
public class atv1 {
    public static void main(String[] args){

        //Leia  um vetor de  notas, em  que  a quantidade é especificada pelo  usuário. Em seguida, calcule a média  das notas digitadas. Finalmente, exiba o conjunto das notas maiores do que a média calculada, bem como o conjunto de notas menores do que a média.OBS: Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota.
        
        Scanner dados = new Scanner(System.in);
        int alunos;

        System.out.print("Digite a quantidade de alunos: ");
        alunos = dados.nextInt();

        double[] notas = new double[alunos];

        recebeNotas(notas);

    }

    public static double[] calculaMedia(double[] array){
        double cont = 0;
        for(int i = 0; i < array.legth; i++){
            cont = cont = array[i];
        }
        return cont;
    }

    public static double[] recebeNotas(double[] array, double nota){
        for(int n = 0; n < array.legth; n++){
            n++;
            System.out.print("Digite a nota do aluno: " + (n + 1));

            if(nota >= 0 && nota <= 10){
                array = nota[n];
            } else {
                n--;
                System.out.print("Digite uma nota entre 0 e 10: ");
                continue;
            }
        }
        return array;
    }

}
