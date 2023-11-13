import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       /* int num;

        System.out.println("Insira");
        num = input.nextInt();

        for(int i = 1; i <= 10; i++){

            System.out.println(num + " x " + i + " = " + (num * i));

        }*/

        int[] vetor = new int[10];



        int maior = vetor[0];

        for(int i = 1; i < vetor.length; i++){
            if(vetor[i] < maior){
                maior = vetor[i];
            }
        }

        System.out.println(maior);

    }
}