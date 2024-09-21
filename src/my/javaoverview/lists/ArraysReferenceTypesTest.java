package my.javaoverview.lists;

public class ArraysReferenceTypesTest {
    public static void main(String[] args) {

        System.out.println("== Arrays com tipos de referênciaa ==");

        // Array de inteiros com tamanho fixo
        Integer[] idades = new Integer[10];
        idades[0] = 100;
        idades[1] = 200;
        idades[3] = 300;

        System.out.println("\nPrimeiro item do objeto idades = " +  idades[0]);

        System.out.println("\nExecutando idades");
        loopArray(idades);


        System.out.println("\nExecutando idades");

        idades = new Integer[10]; // Criando nova instancia, alterando o tamanho
        loopArray(idades);


        System.out.println("\nUso de outros tipos primitivos como array");
        Boolean[] arrayBool = new Boolean[3];
        Float[] arrayFloat = new Float[3];
        Character[] arrayChar = new Character[3];

        loopArray(arrayBool);
        loopArray(arrayFloat);
        loopArray(arrayChar);
    }

    // Uso de Object
    // Classe pai de todos os tipos referências
    public static void loopArray(Object[] array){
        int count;
        for(count = 0; count < array.length; count++){
            System.out.println(array[count]);
        }
    }
}
