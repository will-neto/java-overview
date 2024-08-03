package my.javaoverview.types;

public class StringClass {
    public static void main(String[] args) {
        System.out.println("Clase String");
        System.out.println("Representa um conjunto de caracteres (por traz é uma coleção de tipos char)");

        String varString = "Texto da variável tipo String";

        System.out.println("varString = " + varString);

        System.out.println("Não é tratado como um tipo primitivo, por ser pertencente a uma Classe (especial neste caso)");
        System.out.println("O Java armazena as strings no Pool de Strings (ou intern pools). Essa técnica de armazenamento" +
                "permite a utilização da mesma instância para Strings com o mesmo descritivo: ");

        String varString2 = "Texto String";
        String varString3 = "Texto String";

        System.out.println("varString2 == varString3? = " + (varString2 == varString3));
        System.out.println("varString2 == varString3? = " + (varString2.equals(varString3)));

    }
}
