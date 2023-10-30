package FichaPratica03;

public class Ex02 {
    public static void main(String[] args) {
        int numeroPar = 1;

        while(numeroPar <= 400){
            if(numeroPar%2 == 0) {
                System.out.println(numeroPar);
            }
            numeroPar = numeroPar+1;
        }
    }
}
