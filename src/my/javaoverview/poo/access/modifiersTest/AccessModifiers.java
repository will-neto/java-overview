package my.javaoverview.poo.access.modifiersTest;

import my.javaoverview.poo.access.modifiers.InheritedPublicClass;
import my.javaoverview.poo.access.modifiers.PublicClass;

public class AccessModifiers {

    public static void main(String[] args) {

        System.out.println("\nVisibilidade Propriedades da PublicClass");
        PublicClass publicClass = new PublicClass();
        publicClass.propriedadePublica = "ACESSIVEL EM QUALQUER CANTO!";

        // Erro de compilação
        // Não acessivel fora de outro pacote
        // publicClass.propriedadeProtegida = "ACESSIVEL POIS ESTAMOS CHAMANDO DENTRO DO MESMO PACOTE";

        // Erro de compilação=
        // Não acessivel fora de outro pacote
        // publicClass.propriedadePadrao = "ACESSÍVEL POIS ESTAMOS CHAMANDO DENTRO DO MESMO PACOTE";

        // Só é visível/editável dentro chamada dentro da mesma classe
        // Erro de compilação
        // publicClass.propriedadePrivada = "NÃO É POSSÍVEL, POIS ESTÁ LIMITADA A VISUALIZAÇÃO/EDIÇÃO APENAS DENTRO DA MESMA CLASSE";
        publicClass.valoresPropriedades();


        System.out.println("\nVisibilidade Propriedades da InheritedPublicClass (Subclass da PublicClass)");
        InheritedPublicClass inheritedPublicClass = new InheritedPublicClass();
        inheritedPublicClass.propriedadePublica = "ACESSIVEL EM QUALQUER CANTO!";

        // Erro de compilação
        // Não acessivel fora de outro pacote
        // inheritedPublicClass.propriedadeProtegida = "ACESSIVEL POIS ESTAMOS CHAMANDO DENTRO DO MESMO PACOTE";

        // Erro de compilação
        // Não acessivel fora de outro pacote
        // inheritedPublicClass.propriedadePadrao = "ACESSÍVEL POIS ESTAMOS CHAMANDO DENTRO DO MESMO PACOTE";

        // Só é visível/editável dentro chamada dentro da mesma classe
        // Erro de compilação
        //inheritedPublicClass.propriedadePrivada = "NÃO É POSSÍVEL A CHAMADA, POIS NEM A SUBCLASSE TEM ACESSO, APESAR DE HERDADE";
        inheritedPublicClass.valoresPropriedades();


        System.out.println("\nVisibilidade Propriedades da InheritPublicClassInAnotherPackage (Subclass da PublicClass)");
        // Subclasse presente neste package de teste
        // Herda da classe que está em outro pacote
        InheritPublicClassInAnotherPackage inheritPublicClassInAnotherPackage = new InheritPublicClassInAnotherPackage();
        // Por dentro da classe, podemos visualizar a propriedade protected e altera-la
        inheritPublicClassInAnotherPackage.propriedadePublica = "VISIVEL MESMO EM OUTRO PACOTE";
        // propriedadePadrao e propriedadePrivada não são visiveis
        inheritPublicClassInAnotherPackage.aFimDeEvidencia();
        inheritPublicClassInAnotherPackage.valoresPropriedades();

    }


}
