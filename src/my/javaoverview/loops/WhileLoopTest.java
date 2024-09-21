package my.javaoverview.loops;

public class WhileLoopTest {
    public static void main(String[] args) {
        System.out.println("Estruturas de Repetição - While / Do-While");

        System.out.println("\n==While (confere a condição antes de executar)== ");
        int count = 0;
        while (count < 10) {
            count++;
            System.out.println("count = " + count);
        }

        System.out.println("\n==Do-While (sempre executa uma vez antes de conferir a condição)==");
        count = 0;
        do {
            System.out.println("count = " + count);
            count++;
        } while (count < 10);
    }
}
