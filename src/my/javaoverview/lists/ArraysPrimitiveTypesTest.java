package my.javaoverview.lists;

public class ArraysPrimitiveTypesTest {
    public static void main(String[] args) {

        System.out.println("== Arrays com tipos primitivos ==");

        // Array de inteiros com tamanho fixo
        int[] idades = new int[10];
        idades[0] = 100;
        idades[1] = 200;
        idades[3] = 300;

        System.out.println("\nPrimeiro item do objeto idades = " +  idades[0]);

        System.out.println("\nExecutando idades");
        loopArray(idades);


        System.out.println("\nExecutando idades");

        idades = new int[10]; // Criando nova instancia, alterando o tamanho
        loopArray(idades);

        System.out.println("\nUso do Vargs apenas pra evidência da utilização");
        loopArray(1, 2, 3);

        System.out.println("\nUso de outros tipos primitivos como array");
        boolean[] arrayBool = new boolean[3];
        float[] arrayFloat = new float[3];
        char[] arrayChar = new char[3];

        loopArray(arrayBool);
        loopArray(arrayFloat);
        loopArray(arrayChar);
    }

    // Uso de Vargs - int... (nada mais que uma lista de parametros que podem ser passados separados por virgula no argumento
    // Itens devem ser do tipo int
    public static void loopArray(int... array){
        int count;
        for(count = 0; count < array.length; count++){
            System.out.println(array[count]);
        }
    }

    public static void loopArray(boolean... array){
        int count;
        for(count = 0; count < array.length; count++){
            System.out.println(array[count]);
        }
    }

    public static void loopArray(float... array){
        int count;
        for(count = 0; count < array.length; count++){
            System.out.println(array[count]);
        }
    }

    public static void loopArray(char... array){
        int count;
        for(count = 0; count < array.length; count++){
            System.out.println(array[count]);
        }
    }
}
