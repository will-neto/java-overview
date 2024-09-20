package my.javaoverview.poo.access.modifiers;

public class InheritedPublicClass extends PublicClass {

    public void aFimDeEvidencia() {
        // Não é possível utilizar a propriedade privada, mesmo em subclasses
        // Erro de compilação
        // System.out.println(propriedadePrivada);
    }
}
