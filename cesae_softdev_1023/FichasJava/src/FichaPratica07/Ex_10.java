package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Ficheiros/exercicio_10.csv"));

        String linha;
        double valorTotal = 0;
        double total  = 0;

        //Declarar para pular o cabeçalho.
        linha = sc.nextLine();

        //ler o ficheiro
        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] valorLinha = linha.split(",");

            total = (Double.parseDouble(valorLinha[2]) * Double.parseDouble(valorLinha[3]));

            valorTotal+= total;

        }
        System.out.println(valorTotal);

    }

}
