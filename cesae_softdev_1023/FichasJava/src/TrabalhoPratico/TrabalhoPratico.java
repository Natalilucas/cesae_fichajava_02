package TrabalhoPratico;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TrabalhoPratico {

    //Função para ler o ficheiro;
    public static int linhas(String caminho) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(caminho));
        int linha = 0;

        while(sc.hasNextLine()){
            sc.nextLine();
            linha++;
        }
        return linha;
    }

    public static int colunas(String caminho) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(caminho));

        int colunas = 0;

        String linha = sc.nextLine();
        String[] itensLinha = linha.split(";");

        colunas = itensLinha.length;

        return colunas;

    }

    public static String[][] criarMatriz(String caminho) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(caminho));

        int numeroLinhas = (linhas(caminho)) - 1;

        int numeroColunas = colunas(caminho);

        String[][] matrizTotal = new String[numeroLinhas][numeroColunas];

        String linhaAtual = sc.nextLine();
        int linhaMatriz = 0;

        while (sc.hasNextLine()) {
            linhaAtual = sc.nextLine();
            String[] itensLinha = linhaAtual.split(";");

            for (int i = 0; i < itensLinha.length; i++) {
                matrizTotal[linhaMatriz][i] = itensLinha[i];
            }
            linhaMatriz++;

        }
        return matrizTotal;
    }

    public static void lerFicheiro(String[][] matriz) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t|\t");
            }
            System.out.println();
        }
    }

    public static double valorVendas(String [][] matriz){
        double valor = matriz.length, valorTotal=0;

        for (int linha = 0; linha < matriz.length; linha++){
            valor = Double.parseDouble(matriz [linha][8]);
            valorTotal+=valor;
        }
        System.out.println("O total de vendas " + matriz.length);
        System.out.println("o valor total das vendas é:  " + valorTotal);

        return valor;
    }

    public static double totalLucro(String [][] matriz){
        double valor = matriz.length, valorLucro=0, valorTotal = 0;

        for (int linha = 0; linha < matriz.length; linha++){
            valor = Double.parseDouble(matriz [linha][8]);
            valorTotal+=valor;

            valorLucro = valorTotal*0.2;
        }
        System.out.println("O total das vendas " + valorTotal);
        System.out.println("o valor total do lucro é :  " + valorLucro);

        return valorLucro;
    }

    public static void pesquisarCliente() throws FileNotFoundException {
        String[][] matriz = criarMatriz("FicheiroTrabPra/GameStart_V2.csv");

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o Id do cliente para pesquisar");
        int idClientePes = input.nextInt();

        for(int i = 0; i < matriz.length; i++){
            if(idClientePes == Integer.parseInt(matriz[i][1])){
                System.out.println("Nome" + matriz[i][2] + "\nTelefone " +matriz[i][3] + "\nEmail"  + matriz[i][4]);
            }
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
                "2 - Cliente" +
                "3 -Para sair do menu");
        escolha = input.nextInt();


        //natali criar case pra sair!!
        switch (escolha) {
            case 1:
                //Ciclo o qual irá pedir a senha do utilizador, caso digite a senha correta, deve continuar a pedir a senha, ou dar a opção de sair do menu.
                do{
                    System.out.println("Se é administrador, digite sua senha: ");
                    digiteSenha = Integer.parseInt(input.next());
                    if(digiteSenha == password){
                        System.out.println("Bem Vindo ADMINISTRADOR!!\n");
                        lerFicheiro(criarMatriz("FicheiroTrabPra/GameStart_V2.csv"));
                        System.out.println("Menu do administrador: \n" +
                                 "1 - Calcule o total de vendas\n" +
                                "2 - Calcule o lucro\n" +
                                "3 - Obter a informação do cliente\n" );
                        int opcao = input.nextInt();
                        switch (opcao){
                            case 1:
                                //2 - função das vendas totais
                                valorVendas(criarMatriz("FicheiroTrabPra/GameStart_V2.csv"));
                                break;
                            case 2:
                                //3-Sabendo o valor em cada jogo, calcule o total de lucro.
                                totalLucro(criarMatriz("FicheiroTrabPra/GameStart_V2.csv"));
                                break;
                            case 3:
                                //4 - Dado um idCliente, imprima todas as informações associadas a esse cliente (nome, contacto, email).
                                pesquisarCliente();
                                break;
                            case 4:
                                

                        }

                    } /*else if (digiteSenha == 3) {

                    }*/ else {
                        System.out.println("A senha está incorreta, digite novamente, ou digite 3 para sair do menu! ");
                        digiteSenha = Integer.parseInt(input.next());
                    }

                }while(digiteSenha != password);
                break;
            case 2:
                break;
            case 3:
                break;
        }


        }
    }
