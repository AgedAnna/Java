public class pesquisa {
    public static void main(String[] args){

    int vetor[] = {27, 19, 37, 15, 20, 17, 21, 12};
    int procurado = 20;
    int resultado = buscaSequencial(vetor, procurado);

    System.out.println((resultado != -1)? "O elemento: " + procurado + " está presente na posição: " + (resultado) : "O elemento não existe");

    }

    public static int buscaSequencial(int[] v, int procurado){
        int i;
        boolean achou = false;
        
        for(i = 0; i < v.length; i++){
            if(v[i] == procurado){
                achou = true;
                break;
            }
        }

        if(achou == true){
            return i + 1;
        } else {
            return - 1;
        }
    }
}
