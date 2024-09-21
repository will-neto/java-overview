package my.javaoverview.poo.errors.exceptions.custom;

public class CustomExceptionTest {
    public static void main(String[] args) {

        System.out.println("== Exceção customizada ==");

        try {
            excecaoCustomizada();
        } catch (CustomException e) {
            System.out.println(e);
        }

    }

    private static void excecaoCustomizada() throws CustomException {
        throw new CustomException("Exceção!");
    }
}
