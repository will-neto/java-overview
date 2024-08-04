package my.javaoverview.operators;

public class Logical {
    public static void main(String[] args) {
        System.out.println("Operadores Lógicos");

        int varInt1 = 10;
        int varInt2 = 20;
        int varInt3 = 30;

        System.out.println("\nOperador AND => &&");
        boolean operadorAND = varInt1 < varInt2 && varInt2 < varInt3;
        System.out.println("operadorAnd = " + operadorAND);

        System.out.println("\nOperador OR => ||");
        boolean operadorOR = varInt1 < varInt2 || varInt2 > varInt3;
        System.out.println("operadorOR = " + operadorOR);

        System.out.println("\nOperador NOT => !");
        System.out.println("operadorOR (com NOT) = " + !operadorOR);

        System.out.println("\nOperador XOR => ^");
        boolean operadorXOR = varInt1 < varInt2 ^ varInt2 < varInt3;
        System.out.println("operadorXOR = " + operadorXOR);
    }
}
