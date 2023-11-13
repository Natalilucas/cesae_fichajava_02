package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex_02 {
    public static void main(String[] args) throws FileNotFoundException {

            File novoFicheiro = new File ("Ficheiros/exercicio_02.txt");

            PrintWriter escritanoFicheiro = new PrintWriter(novoFicheiro);

            String mensagem = "Engenharia de software é minha profissão!!";

            escritanoFicheiro.print(mensagem);

            escritanoFicheiro.close();


    }

}
