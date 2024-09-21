package my.javaoverview.loops;

public class ForLoopTest {
    public static void main(String[] args) {
        System.out.println("Estruturas de Repetição - For");

        for (int count = 0; count <= 10; count++){
            System.out.println("count = " + count);
        }

        System.out.println("\nEstruturas de Repetição - For com Break");

        for (int count = 0; count <= 10; count++){

            if (count == 7)
                break;

            System.out.println("count = " + count);
        }

        System.out.println("\nEstruturas de Repetição - For com Continue");

        for (int count = 0; count <= 10; count++){

            if (count % 2 == 1)
                continue;

            System.out.println("count = " + count + " é par");
        }
    }
}
