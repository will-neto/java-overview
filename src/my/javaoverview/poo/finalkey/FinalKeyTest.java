package my.javaoverview.poo.finalkey;

public class FinalKeyTest {
    public static void main(String[] args) {

        FinalKeyClass finalKeyClass = new FinalKeyClass();
        finalKeyClass.metodoNaoPodeSerSobrescrito();

        // Pode ser instanciada novamente
        finalKeyClass = new FinalKeyClass();

    }
}
