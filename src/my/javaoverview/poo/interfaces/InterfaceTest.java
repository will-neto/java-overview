package my.javaoverview.poo.interfaces;

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println("== Interfaces ==");

        System.out.println("Chamada dos métodos de Fusca");
        Fusca fusca = new Fusca();
        fusca.abrirPorta();
        fusca.freiar();
        fusca.souReliquia();

        System.out.println("\nChamada de método e propriedade estática");
        Automovel.ligarLuz();
        System.out.println(Automovel.retrovisores);

        // Tambem funciona com polimorfismo
        Automovel fusca2 = new Fusca();


    }
}
