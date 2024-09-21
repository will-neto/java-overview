package my.javaoverview.poo.abstracts;

// Uma classe abstrata é uma classe que não pode ser instânciada
// Seu principal propósito é ser herdada por outra classe
public abstract class Animal {

    // Podem possuir campos normais
    public String nome;
    // Podem possuir campos estáticos
    public static Boolean status = true;

    // Podem possuir construtores
    public Animal(String campoNormal) {
        this.nome = campoNormal;
    }

    // Podem possuir métodos abstratos
    // Métodos abstratos devem ser sobrescritos por obrigatoriedade pelas subclasses
    public abstract void comer();

    // Podem possuir metodos "final" normalmente
    public final void metodoFinalExemplo(){
        System.out.println("Meu nome é: " + nome);
    }
    // Podem possuir metodos estáticos normalmente
    public static void alterarStatus(){
        status = !status;
    }
}
