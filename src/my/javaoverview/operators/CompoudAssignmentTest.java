package my.javaoverview.operators;

public class CompoudAssignmentTest {
    public static void main(String[] args) {
        System.out.println("Operadores de Atribuição Composta");

        int varIntSoma = 10;
        int varIntSubtracao = 10;
        int varIntMultiplicacao = 10;
        int varIntDivisao = 10;

        varIntSoma += 3;
        varIntSubtracao -= 3;
        varIntMultiplicacao *= 5;
        varIntDivisao /= 10;

        System.out.println("varIntSoma = " + varIntSoma);
        System.out.println("varIntSubtracao = " + varIntSubtracao);
        System.out.println("varIntMultiplicacao = " + varIntMultiplicacao);
        System.out.println("varIntDivisao = " + varIntDivisao);

    }
}
