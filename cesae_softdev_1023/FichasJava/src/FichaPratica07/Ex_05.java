package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("Ficheiros/exercicio_05_1999.txt"));

        String numeros;
        int total = 0;

        while (sc.hasNextLine()){
            numeros = sc.nextLine();
            String [] itensDaLinha = numeros.split(" ");
            //System.out.println(numeros);

            for(int i = 0; i < itensDaLinha.length; i++){
                int itensNumeros = Integer.parseInt(itensDaLinha[i]);
                //System.out.println(itensNumeros);
                total+= itensNumeros;

            }
            System.out.println(total);

          /*  try {

            } catch (Exception e) {
                throw new RuntimeException(e);
            }*/
        }

    }
}
