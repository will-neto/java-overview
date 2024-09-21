package my.javaoverview.poo.errors.exceptions.overriding;

import my.javaoverview.poo.errors.exceptions.custom.CustomException;

import java.io.FileNotFoundException;

public class Fruit {

    public void salvar() throws CustomException, FileNotFoundException {
        System.out.println("salvando fruta...");
    }
}
