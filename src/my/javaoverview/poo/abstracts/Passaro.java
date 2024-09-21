package my.javaoverview.poo.abstracts;

public class Passaro extends Animal{

    public Passaro(String campoNormal) {
        super(campoNormal);
    }

    // Obrigatoriedade na sobrescrita de metodos abstratos
    @Override
    public void comer() {
        System.out.println("Piu!! piu!! come alpiste!!");
    }
}
