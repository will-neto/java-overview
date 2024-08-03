package my.javaoverview.types;

public class PrimitiveTypesCasting {
    public static void main(String[] args) {
        System.out.println("Tipos Primitivos - Casting");
        System.out.println("Processo de conversão de um valor de um tipo primitivo para outro");

        System.out.println("\nCasting Implitico");
        System.out.println("Possível quando a conversão de um tipo menor para maior é feita");
        System.out.println("Apenas a atribuição do valor é necessária");

        byte varByte = 123;
        int varInt = varByte;
        long varLong = varInt;

        System.out.println("\nvarByte = " + varByte);
        System.out.println("varInt = " + varInt);
        System.out.println("varLong = " + varLong);

        System.out.println("\nCasting Explícito");
        System.out.println("Possível quando a conversão de um tipo maior para menor é feita");
        System.out.println("Necessidade de especificar o tipo quando feita a atribuição do valor");


        long varLong2 = 123L;
        int varInt2 = (int) varLong2;
        byte varByte2 = (byte) varInt2;

        System.out.println("\nvarLong2 = " + varLong2);
        System.out.println("varInt2 = " + varInt2);
        System.out.println("varByte2 = " + varByte2);

        System.out.println("\nOverflow - Se o valor for maior do que o valor máximo do tipo, " +
                "o valor é cortado (através dos números de bits) e sofre alteração no resultado final");

        long varLong3 = 1234567891011121314L;
        int varInt3 = (int) varLong2;
        byte varByte3 = (byte) varInt2;

        System.out.println("\nvarLong3 = " + varLong3);
        System.out.println("varInt3 = " + varInt3);
        System.out.println("varByte3 = " + varByte3);

        System.out.println("\nUnderflow - Se o valor for menor do que o valor minímo do tipo, " +
                "o valor é cortado (através dos números de bits) e sofre alteração no resultado final");

        byte minByte = Byte.MIN_VALUE;
        byte minByteUnderflowed = (byte) (minByte - 1);

        System.out.println("minByte = " + minByte);
        System.out.println("minByteUnderflowed = " + minByteUnderflowed);

    }


}
