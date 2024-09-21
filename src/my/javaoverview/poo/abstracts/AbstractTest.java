package my.javaoverview.poo.abstracts;

public class AbstractTest {
    public static void main(String[] args) {
        System.out.println("Classes e métodos abstratos");

        // Erro de compilação
        // Não é possível istanciar uma classe abstrata
        // Animal animal = new Animal();

        Passaro passaro = new Passaro("Canarinho Pistola");
        Animal passaro2 = new Passaro("Blu");

        passaro.comer();
        passaro2.comer();

        // Metodos finais sao executados normalmente
        passaro.metodoFinalExemplo();

        // Propriedades e metodos estaticos também
        System.out.println(Animal.status);
        Animal.alterarStatus();
        System.out.println(Animal.status);

    }
}
