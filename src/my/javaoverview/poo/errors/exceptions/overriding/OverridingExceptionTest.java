package my.javaoverview.poo.errors.exceptions.overriding;

import my.javaoverview.poo.errors.exceptions.custom.CustomException;

import java.io.FileNotFoundException;

public class OverridingExceptionTest {
    public static void main(String[] args) {
        System.out.println("Sobrescrita de métodos com propagação de exceção");

        Fruit fruit = new Fruit();

        try {
            fruit.salvar();
        } catch (CustomException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Apple maca = new Apple();

        // Como comentado no arquivo Apple.java
        // Apesar da propagação de exceção da ArithmeticException, não colocamos tratativa try-catch nem por propagação,
        // pois erros do tipo RuntimeException não exigem necessidade de declaração
        maca.salvar();
    }
}
