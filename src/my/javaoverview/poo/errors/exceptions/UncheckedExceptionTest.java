package my.javaoverview.poo.errors.exceptions;

public class UncheckedExceptionTest {
    public static void main(String[] args) {
        System.out.println("== Unchecked Exceptions ==");

        // Exceções disparadas sem que o compilador obrigue uma tratativa em código

        int[] numeros = { 1,2 };
        // Dispara o ArrayIndexOutOfBoundsException pois não existe terceira posição no array
        System.out.println(numeros[2]);

        Object object = null;
        // Dispara o nullpointerexception pois o objeto está nulo e não é possível chamar toString()
        System.out.println(object.toString());


    }
}
