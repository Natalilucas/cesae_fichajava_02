package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Ficheiros/exercicio_06.txt"));

        String linha, nome, nomeVelho = "";
        int idadeMaior=0, idade;

        while(sc.hasNextLine()) {
            //Ler o arquivo com os nomes e idades
            linha = sc.nextLine();
            String[] itensdaLinha = linha.split(",");

            //separar o nome, e idade e transformar a idade
            nome = itensdaLinha[0];
            idade = Integer.parseInt(itensdaLinha[1]);


            if (idade > idadeMaior) {
                idadeMaior = idade;
                nomeVelho = nome;

            }
        }

        System.out.println(" O mais velho é " + nomeVelho + " que tem " + idadeMaior);

    }
}
