package my.javaoverview.poo.errors.exceptions.overriding;

public class Apple extends Fruit {

    // Durante a sobrescrita de métodos que possam possuir propagação de exceção, não temos obrigatoriedade de
    // especificar os erros que ela possa disparar, já que as instruções serão alteradas
    @Override
    public void  salvar() throws ArithmeticException { // A ArithmeticException é do tipo RuntimeException, porém, não é obrigatorio
                                                        // utilizar tratativa de try-catch para erros do tipo RuntimeException
        System.out.println("salvando maçã...");
    }
}
