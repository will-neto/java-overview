package my.javaoverview.operators;

public class RelationalTest {
    public static void main(String[] args) {
        System.out.println("Operadores Relacionais");
        System.out.println("Operadores que comparam valores e retornam um resultado booleano = verdadeiro ou falso");

        int var1 = 10;
        int var2 = 9;

        boolean varOperadorIgualA = (var1 == var2);
        boolean varOperadorDiferenteDe = (var1 != var2);
        boolean varOperadorMaiorQue = (var1 > var2);
        boolean varOperadorMenorQue = (var1 < var2);
        boolean varOperadorMaiorOuIgualQue = (var1 >= var2);
        boolean varOperadorMenorOuIgualQue = (var1 <= var2);

        System.out.println("Operador de Igual a: " + varOperadorIgualA);
        System.out.println("Operador de Diferente de: " + varOperadorDiferenteDe);
        System.out.println("Operador de Maior que: " + varOperadorMaiorQue);
        System.out.println("Operador de Menor que: " + varOperadorMenorQue);
        System.out.println("Operador de Maior ou Igual que: " + varOperadorMaiorOuIgualQue);
        System.out.println("Operador de Menor ou Igual que: " + varOperadorMenorOuIgualQue);

    }
}
