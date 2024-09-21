package my.javaoverview.poo.enums;

public class EnumTest {
    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog("Belith :)", Breed.Dalmata),
                new Dog("Cindy <3", Breed.Poodle),
                new Dog("Kiara <3", Breed.Poodle),
                new Dog("Princesa", Breed.Husky),
                new Dog("Laika :)", Breed.SemRacaDefinida),
                new Dog("Luma <3", Breed.GoldenRetriever),
                new Dog("Malu :)", Breed.BorderCollie)
        };

        for(Dog dog: dogs){
            System.out.println(dog.getNome() + " - (" + dog.getBreed() + "): au au!!");
        }

        System.out.println("\nListagem de valores no Enum de raças");

        for(Breed breed: Breed.values()){
            System.out.println(breed + "[" + breed.ordinal() + "] = id[" + breed.getId() + "]");
            System.out.println("\tlatirAlto: " + breed.latirAlto());
        }


    }
}
