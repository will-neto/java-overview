package my.javaoverview.conditionals;

public class IfStatement {
    public static void main(String[] args) {
        System.out.println("Estruturas Condicional - IF / ELSE / ELSE IF");

        boolean varTrue = true;
        boolean varTrue2 = true;
        boolean varFalse = false;

        System.out.println("\nCondicional IF");

        if (varTrue) {
            System.out.println("varTrue = " + varTrue);
        }

        if (!varFalse) {
            System.out.println("varFalse = " + varFalse);
        }

        System.out.println("\nCondicional IF/ELSE");

        if (varTrue) {
            System.out.println("varTrue = " + varTrue);
        } else {
            System.out.println("Bloco nao alcançado");
        }

        if (!varTrue) {
            System.out.println("Bloco nao alcançado");
        } else {
            System.out.println("varFalse = " + varFalse);
        }

        System.out.println("\nCondicional IF/ELSE IF/ELSE");

        if (varTrue == true && varTrue2 == false){
            System.out.println("Bloco nao alcançado");
        } else if (varTrue == true && varTrue2 == true) {
            System.out.println("varTrue = " + varTrue);
        } else {
            System.out.println("Bloco nao alcançado");
        }

        System.out.println("\nCondicional com Operador Ternario");

        String mensagem = varTrue && varTrue2 ? "VERDADEIRO" : "FALSO";
        String mensagem2 = varTrue && varFalse ? "VERDADEIRO" : "FALSO";

        System.out.println("mensagem = " + mensagem);
        System.out.println("mensagem2 = " + mensagem2);

        // Exemplo tributacao
        // <= 1000 = 6%
        // <= 2000 = 10%
        // > 2000 = 13%

        System.out.println("\nCondicional com Operador Ternario (multiplas condicionais)");

        double valor = 4034;

        double tributacaoPercentual = valor <= 1000 ? 0.06 : (valor <= 2000 ? 0.1 : 0.13);

        System.out.println("tributacaoPercentual = " + tributacaoPercentual);

    }
}
