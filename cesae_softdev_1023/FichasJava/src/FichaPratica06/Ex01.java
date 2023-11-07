package FichaPratica06;

import java.util.Scanner;

public class Ex01 {
    public static  void fazerBarulho(String animal){
        switch (animal){
            case "Cão":
                System.out.println("au au au");
                break;
            case "Gato":
                System.out.println("Miau");
            case "peixe":
                System.out.println("Glub Glub");
            case "vaca":
                System.out.println("Muuuu");
            case "porco":
                System.out.println("Oinc Oinc");
            default:
                System.out.println("animal desconhecido");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String animalEscolhido;

        System.out.println("Insira um animal");

        animalEscolhido = input.next();

        fazerBarulho(animalEscolhido);
    }
}
