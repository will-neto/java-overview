package my.javaoverview.poo.errors.exceptions;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionsTest {
    public static void main(String[] args) throws IOException {

        System.out.println("== Checked Exceptions == ");

        // Exceções que indicam o compilador para incluirmos código de tratativa via try-catch ou por propagação da exceção

        exemploPropagacaoDaExecao();

        exemploTryCatch();

    }

    // Exemplo de chamada com try-catch
    private static void exemploTryCatch(){

        File file = new File("files\\exceptions\\arquivo1.txt");

        // Uso do try-catch para tratativa e silenciamento do erro de compilação
        try {
            boolean foiCriado = file.createNewFile();
            System.out.println("O arquivo foi criado");
        } catch (IOException e) { // Recebe o erro na variável e
            System.out.println(e);
        }

        System.out.println("Finalizado");
    }

    // Exemplo de propagação de exceção, obrigando quem for chamar esse método a tratar o erro
    private static void exemploPropagacaoDaExecao() throws IOException { // Inclusão da propagação aqui

        File file = new File("files\\exceptions\\arquivo2.txt");

        boolean foiCriado = file.createNewFile();
        System.out.println("O arquivo foi criado");

        System.out.println("Finalizado");
    }
}
