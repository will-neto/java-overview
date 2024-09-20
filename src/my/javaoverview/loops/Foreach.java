package my.javaoverview.loops;

import java.util.Random;

public class Foreach {
    public static void main(String[] args) {
        System.out.println("== Foreach ==");

        int[] numeros = new int[10];

        Random random = new Random();

        // Inclui valores aleatorios (de 0 a 100) no array
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = random.nextInt(0, 1000);
        }

        // Imprime via foreach
        // Exclui necessidade de uma variavel auxiliar de indice
        for (int numero: numeros){
            System.out.println(numero);
        }

        for (int numero: numeros){
            System.out.println(numero);
        }

    }
}
