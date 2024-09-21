package my.javaoverview.tools.natives.strings;

public class StringBuilderTest {
    public static void main(String[] args) {

        // NOTE: diminui o tempo pra nao travar os testes nos outros métodos do StringBuilder
        int concatNumero = 10;

        System.out.println("\n== Manipulação de sequências de caracteres com classe String==");
        // Uso da classe String para manipulação de caracteres/textos pode afetar bastante a performance do sistema
        long inicio = System.currentTimeMillis(); // Pega o tempo em Milissegundos atual
        concatString(concatNumero);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo levado para concatenar " + concatNumero  + "x = " + (fim - inicio) + "ms");


        System.out.println("\n== Manipulação de sequências de caracteres com classe StringBuilder ==");
        // A classe StringBuilder é utilizada para manipular sequências de caracteres (textos) de forma eficiente.
        // O StringBuilder permite contornar a necessidade de gerar novos objetos na heap toda vez que um texto é concatenado,
        // tornando o código mais eficiente e performático.
        long inicioSb = System.currentTimeMillis(); // Pega o tempo em Milissegundos atual
        concatStringBuilder(concatNumero);
        long fimSb = System.currentTimeMillis();
        System.out.println("Tempo levado = " + (fimSb - inicioSb) + "ms");

        System.out.println("\n\n== Demais Métodos String Builder ==\n");

        System.out.println("-- Delete\n");

        StringBuilder sb = new StringBuilder(
                "There were bells on a hill\n" +
                "But I never heard them ringing\n" +
                "No, I never heard them at all\n" +
                "'Til there was you\n");

        System.out.println("Caracteres " + sb.length() + ":\n" + sb);

        sb.delete(0, 26);

        System.out.println("Caracteres " + sb.length() + ":\n" + sb);


        System.out.println("-- Insert\n");

        System.out.println("Caracteres " + sb.length() + ":\n" + sb);

        sb.insert(0, "There were bells on a hill");

        System.out.println("Caracteres " + sb.length() + ":\n" + sb);
    }


    private static void concatString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++){
            texto += i;
        }
    }

    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanho; i++){
            sb.append(i);
        }
    }
}
