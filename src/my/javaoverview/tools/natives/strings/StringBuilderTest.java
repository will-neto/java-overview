package my.javaoverview.tools.natives.strings;

public class StringBuilderTest {
    public static void main(String[] args) {

        int concatNumero = 100_000;

        System.out.println("== Manipulação de sequências de caracteres com classe String==");
        // Uso da classe String para manipulação de caracteres/textos pode afetar bastante a performance do sistema
        long inicio = System.currentTimeMillis(); // Pega o tempo em Milissegundos atual
        concatString(concatNumero);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo levado para concatenar " + concatNumero  + "x = " + (fim - inicio) + "ms");


        System.out.println("== Manipulação de sequências de caracteres com classe StringBuilder ==");
        // A classe StringBuilder é utilizada para manipular sequências de caracteres (textos) de forma eficiente.
        // O StringBuilder permite contornar a necessidade de gerar novos objetos na heap toda vez que um texto é concatenado,
        // tornando o código mais eficiente e performático.
        long inicioSb = System.currentTimeMillis(); // Pega o tempo em Milissegundos atual
        concatStringBuilder(concatNumero);
        long fimSb = System.currentTimeMillis();
        System.out.println("Tempo levado = " + (fimSb - inicioSb) + "ms");
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
