package TrabalhoPratico;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TrabalhoPratico {

    //Função para ler o ficheiro;
    public static int linhas(String caminho) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(caminho));
        int linha = 0;

        while (sc.hasNextLine()) {
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

    public static double valorVendas(String[][] matriz) {
        double valor = matriz.length, valorTotal = 0;

        for (int linha = 0; linha < matriz.length; linha++) {
            valor = Double.parseDouble(matriz[linha][8]);
            valorTotal += valor;
        }
        System.out.println("O total de vendas " + matriz.length);
        System.out.println("o valor total das vendas é:  " + valorTotal);

        return valor;
    }

    public static double totalLucro(String[][] matriz) {
        double valor = matriz.length, valorLucro = 0, valorTotal = 0;

        for (int linha = 0; linha < matriz.length; linha++) {
            valor = Double.parseDouble(matriz[linha][8]);
            valorTotal += valor;

            valorLucro = valorTotal * 0.2;
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

        for (int i = 0; i < matriz.length; i++) {
            if (idClientePes == Integer.parseInt(matriz[i][1])) {
                System.out.println("Nome" + matriz[i][2] + "\nTelefone " + matriz[i][3] + "\nEmail" + matriz[i][4]);
                break;
            }
        }
    }

    public static void jogoCaro(String[][] matrizTotal) throws FileNotFoundException {
        String[][] matriz = criarMatriz("FicheiroTrabPra/GameStart_V2.csv");

        double maisCaro = 0, jogoPreco;
        String nomeJogo = " ", nomeJogoCaro = " ";
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            jogoPreco = Double.parseDouble(matriz[i][8]);
            nomeJogo = matriz[i][7];
            if (jogoPreco > maisCaro) {
                maisCaro = jogoPreco;
                nomeJogoCaro = nomeJogo;
                contador++;
            }
        }
        System.out.println("O jogo mais caro é " + nomeJogoCaro + " no valor de: " + maisCaro);

        /**
         * Encontra o jogador mais caro de acordo com o resultado acima
         */
        for (int j = 0; j < matriz.length; j++) {
            if (matriz[j][7].equals(nomeJogoCaro)) {
                System.out.println(" Comprador(es): " + matriz[j][2]);
            }

        }

    }

    public static boolean triangular(int num) {
        int somatorio = 0, contador = 1;

        while (somatorio < num) {
            somatorio += contador;

            contador++;

            if (somatorio == num) {
                return true;
            }
        }
        return false;
    }

    public static int lugaresVago() {
        int num = 0;

        while (num <= 121) {
            if (triangular(num) && num % 5 == 0) {
                System.out.println(num);
            }
            num++;
        }
        return num;
    }

    public static void titulosJogos() throws FileNotFoundException {
        String[][] matriz = criarMatriz("FicheiroTrabPra/GameStart_V2.csv");
        String jogosLista;
        boolean nRepete = false;

        int contador = 0;

        // Percorrer o array e imprimir na tela
        for (int i = 0; i < matriz.length; i++) {
            jogosLista = matriz[i][7];
            System.out.println(jogosLista);
            contador++;
            // não consegui fazer com que os nomes não s repetissem =(
        }

    }


    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        //Definir o tipo, se ADMIN ou CLIENTE

        int ADMIN = 1, CLIENTE = 2, escolha, password = 123456, digiteSenha;

        //senha para acessar o programa

        String voltar = "N";

        System.out.println("Para acessar o nosso programa informe se é: \n" +
                "1 - Administrador da Loja\n" +
                "2 - Cliente\n" +
                "3 - Para sair do menu");
        escolha = input.nextInt();


        //natali criar case pra sair!!
        switch (escolha) {
            case 1:
                System.out.println("Se é administrador, digite sua senha: ");
                digiteSenha = Integer.parseInt(input.next());
                //Ciclo o qual irá pedir a senha do utilizador, caso digite a senha correta, deve continuar a pedir a senha, ou dar a opção de sair do menu.
                while (digiteSenha != password) {
                    System.out.println("A senha não está correta, insira novamente ou digite 3 para encerrar: ");
                    digiteSenha = Integer.parseInt(input.next());
                    if(digiteSenha == 3){
                        break;
                    }
                }
                //caso a senha esteja correta, passa para este if.
                if (digiteSenha == password) {
                    System.out.println("Bem Vindo ADMINISTRADOR!!\n");
                    lerFicheiro(criarMatriz("FicheiroTrabPra/GameStart_V2.csv"));
                    System.out.println("Menu do administrador: \n" +
                            "1 - Calcule o total de vendas\n" +
                            "2 - Calcule o lucro\n" +
                            "3 - Obter a informação do cliente\n" +
                            " 4 - Jogo mais caro ");
                    int opcao = input.nextInt();
                    switch (opcao) {
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
                            //5. Imprima qual o jogo mais caro e os clientes que o compraram
                            jogoCaro(criarMatriz("FicheiroTrabPra/GameStart_V2.csv"));

                    }
                }
                if (digiteSenha == 3) {
                    System.out.println("Você inseriu 3, o programa será encerrado.");
                    break;
                }
                break;

            case 2:
                //menu-cliente
                System.out.println("O que deseja fazer?\n " +
                        "1 - Inserir cliente\n" +
                        "2 - Procurar estacionamento\n" +
                        "3 - Títulos de jogos\n" +
                        "4 - Jogos por editora");
                int opcao = input.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Insira seus dados para efetuarmos seu cadastro!! ");
                        String nomeCliente, sobrenome, email;
                        int contato;

                        System.out.println("Insira o nome e sobrenome: ");
                        nomeCliente= input.next();
                        sobrenome = input.next();

                        System.out.println("Insira o contato telefonico: ");
                        contato = input.nextInt();
                        System.out.println("Insira o e-mail: ");
                        email = input.next();

                        System.out.println("Cliente inserido com sucesso: " + nomeCliente + " " + sobrenome + " | " + contato + " | " + email);
                        break;
                    case 2:
                        System.out.println("Os lugares vagos são: ");
                        lugaresVago();
                        break;
                    case 3:
                        titulosJogos();
                        break;
                    case 4:
                        break;
                }
                break;
            case 3:
                break;
        }
    }
}
