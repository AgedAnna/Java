import java.util.Scanner;
public class matriz {
    public static void main(String[] args) throws Exception {

    int [][] matriz = new int[2][2];

    preencher(matriz);
    exibir(matriz);
    }

    public static void preencher(int[][] m){
        Scanner dados = new Scanner(System.in);

        for(int l = 0; l < m.length; l++){
            for(int c = 0; c < m[l].length; c++){
                System.out.println("Digite o elemento da matriz: ");
                m[l][c] = dados.nextInt();
            }
        }
    }

    public static void exibir(int[][] m){
        for(int l = 0; l < m.length; l++){
            for(int c = 0; c < m[l].length; c++)
        System.out.print(m[l][c] + " ");
            System.out.print("\n");
        }
    }

}
