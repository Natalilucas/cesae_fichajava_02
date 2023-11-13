package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import static FichaPratica07.BibliotecaFicheiros.imprimirFicheiro;

public class Ex_03 {
    public static void main(String[] args) throws FileNotFoundException {
        //Trazer os ficheiros para o programa

        File lerOFicheiro = new File("Ficheiros/exercicio_03_Alternativa01.txt");
        File novoFicheiro = new File ("Ficheiros/exercicio_03_copia.txt");

        //Scanner - Maquina de ler
        Scanner sc = new Scanner(lerOFicheiro);

        //maquina de escrever
        PrintWriter escritanoFicheiro = new PrintWriter(novoFicheiro);

        String linhaAtual;


        while(sc.hasNext()){
           linhaAtual = sc.nextLine();
           escritanoFicheiro.println(linhaAtual);
        }

        escritanoFicheiro.close();

    }
}
