package my.javaoverview.poo.errors.exceptions;

public class ThrowsExceptionTest {
    public static void main(String[] args) {

        System.out.println("Podemos lançar exceções");

        // Imagine que voce recebeu o valor de dividendo e divisor
        // Deixei o divisor 0 pois é algo que a matemática nao permite
        int dividendo = 10, divisor = 0;

        System.out.println(dividendo);
        System.out.println(divisor);

        if (divisor == 0){
            throw new ArithmeticException("Não é possível divisao por zero");
        }

        // Bla bla bla... código de divisao e afins
    }
}
