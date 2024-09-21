package my.javaoverview.poo.errors.exceptions;

public class MultipleTryCatchExceptionTest {
    public static void main(String[] args) {

        System.out.println("Multiplos catchs");

        try{
            throw new ArithmeticException("Erro aritmetico bla bla");
        } catch (ArithmeticException e){ // Captura erro especifico
            System.out.println("Caiu no catch de Arithmetic");
            System.out.println(e);
        }

        try{
            throw new ArithmeticException("Erro aritmetico bla bla");
        } catch (RuntimeException e){ // Captura erro pois ArithmeticException herda de RuntimeException
            System.out.println("Caiu no catch de Runtime");
            System.out.println(e);
        }

        try{
            throw new IndexOutOfBoundsException("Erro aritmetico bla bla");
        }
        catch (ArithmeticException e){
            System.out.println("Caiu no catch de Arithmetic");
            System.out.println(e);
        }
        catch (RuntimeException e){ // Captura erro pois IndexOutOfBoundsException herda de RuntimeException
            System.out.println("Caiu no catch de Runtime");
            System.out.println(e);
        }

    }
}
