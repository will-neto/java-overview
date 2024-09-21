package my.javaoverview.poo.errors.exceptions;

import java.io.*;

public class TryWithResourcesExceptionTest {
    public static void main(String[] args) {
        System.out.println("Try with resources");

        tryWithResources();

        try {
            tryWithResourcesSemCatch();
        } catch (IOException e){
            System.out.println(e);
        }

        tryWithResourcesMultiplasAberturas();

    }

    private static void tryWithResources() {

        // Semelhante ao using no Csharp, o try with resources permite o gerenciamento e liberação de recursos que
        // precisam ser finalizados (via Closeable) corretamente
        // O objeto deve herdar de Closeable (semelhante ao Csharp que possui o IDisposable)
        // Isso nos tira a necessidade de usar um "finally" pra fechar a conexão ( via close() ) com o objeto
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"))){
            // .... bla bla bla codigo
        } catch (IOException e){
            System.out.println(e);
        }

    }

    // Se a tratativa de erro for através da propagação da exceção podemos remover o catch
    private static void tryWithResourcesSemCatch() throws IOException {

        // Semelhante ao using no Csharp, o try with resources permite o gerenciamento e liberação de recursos que
        // precisam ser finalizados (via Closeable) corretamente
        // O objeto deve herdar de Closeable (semelhante ao Csharp que possui o IDisposable)
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"))) {
            // .... bla bla bla codigo
        }

    }

    // Podemos fazer o gerenciamento de mais de um objeto
    // Se uma das conexões não for aberta corretamente, é abortado para os demais
    private static void tryWithResourcesMultiplasAberturas() {

        try(Reader reader = new BufferedReader(new FileReader( "files\\exceptions\\arquivo1.txt"));
            Reader reader2 = new BufferedReader(new FileReader("files\\exceptions\\arquivo.txt"))
        ) {
            System.out.println("Abriu conexao dos dois arquivos");
            // .... bla bla bla codigo
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
