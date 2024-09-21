package my.javaoverview.operators;

public class UnaryTest {
    public static void main(String[] args) {
        System.out.println("Operadores Unários");

        System.out.println("\nAritméticos => + ou -");
        System.out.println("Trabalha com a inversão de sinais");

        int varInt = 10;
        varInt = -varInt;

        int varInt2 = -10;
        varInt2 = -varInt2;

        int varInt3 = -10;
        varInt3 = +varInt3;

        System.out.println("varInt = " + varInt);
        System.out.println("varInt2 = " + varInt2);
        System.out.println("varInt3 = " + varInt3);

        System.out.println("\nIncremento e Decremento => ++ ou --");

        System.out.println("Incrementa ou Decrementa valor a variável ao qual esta sendo usado o operador");
        System.out.println("Podem ser usados de duas formas. Por pré-incremento, onde o valor é atribuído a variável e posteriormente, usado." +
                "Por pós-incremento, onde a variável é usada e depois o valor é atribuido.");
        int varInt4 = 10;
        int varInt5 = 10;
        System.out.println("Pré-Incremento varInt4 = " + ++varInt4);
        System.out.println("Pós-Incremento varInt4 = " + varInt5++);
        System.out.println("Pós-Incremento (pós) varInt4 = " + varInt5); // Sem uso do operador

        System.out.println("\nUso em atribuição");

        int varInt6 = 5;
        int varInt7 = ++varInt6;

        System.out.println("varInt6 = " + varInt6);
        System.out.println("varInt7 = " + varInt7);

        int varInt8 = 5;
        int varInt9 = varInt8++; // Valor atribuido a varInt8 depois dele ser usado, entao nao reflete o incremento na varInt9

        System.out.println("varInt8 = " + varInt8);
        System.out.println("varInt9 = " + varInt9);

        System.out.println("\nNegação => !");
        System.out.println("Inverte o valor booleano");

        boolean varBool1 = true;
        boolean varBool2 = !varBool1;
        boolean varBool3 = !varBool2;

        System.out.println("varBool1 = " + varBool1);
        System.out.println("varBool2 = " + varBool2);
        System.out.println("varBool3 = " + varBool3);

        System.out.println("\nBit => ~");
        System.out.println("Inverte os digitos binários");

        int varInt10 = 5;
        int varInt11 = ~varInt10;

        System.out.println("varInt10 = " + varInt10 + " | Valor binário:\t" + String.format("%32s", Integer.toBinaryString(varInt10)).replace(' ', '0'));
        System.out.println("varInt11 = " + varInt11 + " | Valor binário:\t" + String.format("%32s", Integer.toBinaryString(varInt11)).replace(' ', '0'));

    }
}