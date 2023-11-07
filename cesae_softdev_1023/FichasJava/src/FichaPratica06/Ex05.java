package FichaPratica06;

import java.util.Scanner;

public class Ex05 {
    Scanner input = new Scanner(System.in);
    public static int maior(int[] vetor) {
    //Ex06.a
        int maiorNum = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maiorNum) {
                maiorNum = vetor[i];
            }
        }
        return maiorNum;
    }
    //Ex06.b
    public static int menor(int [] vetor){

        int  menorNum = vetor[0];

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < menorNum){
                menorNum = vetor[i];
            }
        }
        return menorNum;
    }

    public static boolean crescente(int [] vetor){
        int numAnterior = vetor[0];

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < numAnterior){
                numAnterior = vetor[i];
            }
        }


        return
    }




    public static void main(String[] args) {


    }
}
