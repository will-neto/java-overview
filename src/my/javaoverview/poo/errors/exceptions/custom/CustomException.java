package my.javaoverview.poo.errors.exceptions.custom;

// Podemos criar exceções customizadas simplesmente herdando a classe Exception
public class CustomException extends Exception{
    public CustomException(String message) {
        super("Exceção dispara da classe CustomException: " + message);
    }
}
