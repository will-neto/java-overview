package my.javaoverview.poo.access.modifiersTest;

import my.javaoverview.poo.access.modifiers.PublicClass;

public class InheritPublicClassInAnotherPackage extends PublicClass {
    public void aFimDeEvidencia() {
        // Não é possível utilizar a propriedade privada, mesmo em subclasses
        // Erro de compilação
        // System.out.println(propriedadePrivada);

        propriedadeProtegida = "Acessível por subclasses em outro pacote";
    }
}
