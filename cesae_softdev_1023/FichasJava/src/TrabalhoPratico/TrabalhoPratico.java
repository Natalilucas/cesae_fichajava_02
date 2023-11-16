package TrabalhoPratico;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TrabalhoPratico {

    //Função para ler o ficheiro;
    public static void lerFicheiro(String caminho) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(caminho));
        String linha;

        while(sc.hasNextLine()){
            linha = sc.nextLine();
            System.out.println(linha);
        }
    }


    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        //Definir o tipo, se ADMIN ou CLIENTE

        int ADMIN = 1, CLIENTE = 2, escolha, password = 123456, digiteSenha;

        //senha para acessar o programa

        String voltar = "N";

        System.out.println("Para acessar o nosso programa informe se é: \n" +
                "1 - Administrador da Loja \n" +
                "2 - Cliente");
        escolha = input.nextInt();

        switch (escolha) {
            case 1:
                //Ciclo o qual irá pedir a senha do utilizador, caso digite a senha correta, deve continuar a pedir a senha, ou dar a opção de sair do menu.
                do{
                    System.out.println("Se é administrador, digite sua senha: ");
                    digiteSenha = Integer.parseInt(input.next());
                    if(digiteSenha == password){
                        System.out.println("Bem Vindo ADMINISTRADOR!!\n");
                        lerFicheiro("FicheiroTraPra/GameStart_V2.csv");

                    } else {
                        System.out.println("A senha está incorreta, digite novamente, ou digite N para sair do menu! ");
                        digiteSenha = Integer.parseInt(input.next());
                    }

                }while(digiteSenha != password || voltar != "N");

        }


        }
    }
