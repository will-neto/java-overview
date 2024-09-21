package my.javaoverview.poo.errors;

public class ErrorTests {
    public static void main(String[] args) {
        // Error => StackoverflorException
        metodo();
    }

    public static void metodo(){
        metodo();
    }
}
