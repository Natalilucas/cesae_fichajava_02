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

    //Crescente está errada, voltar aqui
    public static boolean crescente(int [] vetor){
        int numAnterior = vetor[0];
        boolean crescente = false;

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < numAnterior){
                crescente = true;
                numAnterior = vetor[i];
            } else {
                crescente=false;
            }
        }

        if(crescente){
            System.out.println("Crescente");
        } else {
            System.out.println("Não é crescente");
        }

        return crescente;
    }




    public static void main(String[] args) {


    }
}
