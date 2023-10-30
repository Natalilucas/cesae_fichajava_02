package FichaPratica03;

public class Ex06 {
    public static void main(String[] args) {
        int numero = 1, soma = 0;

        while (numero <= 100) {
            System.out.println(numero);
            soma += numero;
            numero = numero + 1;
        }
        System.out.println(soma);
    }
}