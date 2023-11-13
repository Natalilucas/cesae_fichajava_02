package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("Ficheiros/exercicio_05_31.txt"));

        String numeros;
        int total = 0;

        while (sc.hasNextLine()){
            numeros = sc.nextLine();
            String [] itensNumeros = numeros.split(" ");

            //int itensNumerosInt = Integer.parseInt(itensNumeros);

            //System.out.println(itensNumerosInt);

            for(int i = 0; i < itensNumeros.length; i++){

                int itensNumerosInt [];
                //itensNumerosInt[i] = Integer.parseInt(itensNumeros);
                System.out.println(itensNumeros);
            }

        }

    }
}
