package my.javaoverview.lists;

public class ArraysMultidimensional {
    public static void main(String[] args) {
        System.out.println("== Arrays Multidimensionais (Matrizes Regulares)");

        char[] series = { 'A', 'B' };

        String[][] times = new String[2][4];

        times[0][0] = "Botafogo";
        times[0][1] = "Palmeiras";
        times[0][2] = "Fortaleza";
        times[0][3] = "Flamengo";

        times[1][0] = "Novorizontino";
        times[1][1] = "Santos";
        times[1][2] = "Vila Nova";
        times[1][3] = "Sport Recife";

        System.out.println("\nPercorrendo Matriz (regular) com For");

        for(int serie = 0; serie < series.length; serie++){
            System.out.println("Série " + series[serie]);
            for (int time = 0; time < times[0].length; time++){
                System.out.println("\t" + times[serie][time]);
            }
        }

        System.out.println("\nPercorrendo Matriz (regular) com Foreach");

        int index = 0;

        for(String[] timesArray: times){
            System.out.println("Série " + series[index]);
            for(String time: timesArray) {
                System.out.println("\t" + time);
            }
            index++;
        }

        System.out.println("\nMatriz Irregular (jagged array)");

        // Não possui tamanho fixo, o que faz com que seja irregular

        // Declaração + Inicialização
        int[][] matrizB = { {0,1}, {0, 1, 2}, {0, 1, 2, 3}};

        for(int[] row: matrizB){
            System.out.println();
            for(int column: row) {
                System.out.print(column + " ");
            }
        }

        // Código abaixo causa erro, pois o não existe 3 posições (colunas) na primeira linha, apenas na segunda e terceira
        // matrizB[0][2] = 10;

        // É possível declarar um array irregular sem inicializá-lo em sua declaração

        int[][] jaggedArray = new int[3][]; // 3 linhas, mas ainda não definimos o número de colunas

        // Inicializando cada linha individualmente
        jaggedArray[0] = new int[2]; // 2 colunas
        jaggedArray[1] = new int[3]; // 3 colunas
        jaggedArray[2] = new int[4]; // 4 colunas
    }
}
