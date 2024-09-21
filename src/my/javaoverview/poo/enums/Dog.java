package my.javaoverview.poo.enums;

public class Dog {

    private String nome;
    private Breed breed;

    public Dog(String nome, Breed breed) {
        this.nome = nome;
        this.breed = breed;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }
}
