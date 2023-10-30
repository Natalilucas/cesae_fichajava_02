package FichaPratica03;

public class Ex03 {
    public static void main(String[] args) {
        int numeroImpar = 531;

        while (numeroImpar >= 531 && numeroImpar <= 750) {
            if (numeroImpar % 2 != 0) {
                System.out.println(numeroImpar);
            }
            numeroImpar = numeroImpar + 1;
        }
    }
}
