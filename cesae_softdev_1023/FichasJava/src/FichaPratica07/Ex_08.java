package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("Ficheiros/exercicio_08.txt"));
        File nf = new File("Ficheiros/exercicio_08_copia.txt");

        String linha;

        while (sc.hasNextLine()){
            linha = sc.nextLine();
            String[] itensdaLinha = linha.split(" ");
            PrintWriter excreveNovoFicheiro = new PrintWriter(nf);

            for (int i = 0; i < itensdaLinha.length; i++) {
                //System.out.println(itensdaLinha[i]);
                if (itensdaLinha[i].equals("Vitor")) {
                    System.out.println(linha);
                    excreveNovoFicheiro.println(linha);
                }
            }
            excreveNovoFicheiro.close();
        }
    }
}
