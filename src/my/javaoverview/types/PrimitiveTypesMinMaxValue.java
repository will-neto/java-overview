package my.javaoverview.types;

public class PrimitiveTypesMinMaxValue {
    public static void main(String[] args) {
        System.out.println("Tipos Primitivos - Min e Max Value");
        System.out.println("Valores minímos e máximos por tipo Primitivo");

        // Valores mínimos
        byte varByte = Byte.MIN_VALUE;
        short varShort = Short.MIN_VALUE;
        int varInt = Integer.MIN_VALUE;
        long varLong = Long.MIN_VALUE;
        float varFloat = Float.MIN_VALUE;
        double varDouble = Double.MIN_VALUE;
        char varChar = Character.MIN_VALUE;
        boolean varBoolean = false;

        // Valores máximos
        byte varByte2 = Byte.MAX_VALUE;
        short varShort2 = Short.MAX_VALUE;
        int varInt2 = Integer.MAX_VALUE;
        long varLong2 = Long.MAX_VALUE;
        float varFloat2 = Float.MAX_VALUE;
        double varDouble2 = Double.MAX_VALUE;
        char varChar2 = Character.MAX_VALUE;
        boolean varBoolean2 = true;

        // Exibindo os valores
        System.out.println("Byte min: " + varByte);
        System.out.println("Byte max: " + varByte2);
        System.out.println("Short min: " + varShort);
        System.out.println("Short max: " + varShort2);
        System.out.println("Int min: " + varInt);
        System.out.println("Int max: " + varInt2);
        System.out.println("Long min: " + varLong);
        System.out.println("Long max: " + varLong2);
        System.out.println("Float min: " + varFloat);
        System.out.println("Float max: " + varFloat2);
        System.out.println("Double min: " + varDouble);
        System.out.println("Double max: " + varDouble2);
        System.out.println("Char min: " + (int) varChar);
        System.out.println("Char max: " + (int) varChar2);
        System.out.println("Boolean min: " + varBoolean);
        System.out.println("Boolean max: " + varBoolean2);
    }
}
