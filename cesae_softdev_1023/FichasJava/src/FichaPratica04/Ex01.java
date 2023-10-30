package FichaPratica04;

import java.util.Scanner;

public class Ex01 {
         public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int num1, num2 ;
            double resultado;
            char continuar;
            //char '*', '+', '-', '/';

            do{
                System.out.println("Insira um número: ");

                num1 = input.nextInt();
                System.out.println("Insira outro número: ");
                num2 = input.nextInt();
                System.out.println("Qual operação deseja realizar? ");
                continuar = input.next().charAt(0);


                switch (continuar) {
                    case '+':
                        resultado = num1 + num2;
                        System.out.println(resultado);
                        break;
                    case '-':
                        resultado = num1 - num2;
                        System.out.println(resultado);
                        break;
                    case '*':
                        resultado = num1 * num2;
                        System.out.println(resultado);
                        break;
                    case '/':
                        resultado = num1 / num2;
                        System.out.println(resultado);
                        break;
                    default:
                        System.out.println("Essa não é uma operação válida!");
                }
                System.out.println("Deseja continuar? (s para sim, qualquer outra tecla para sair): ");
                continuar = input.next().charAt(0);
            }while (continuar == 's');


        }
    }

