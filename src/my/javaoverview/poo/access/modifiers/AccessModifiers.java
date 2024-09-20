package my.javaoverview.poo.access.modifiers;

public class AccessModifiers {

    public static void main(String[] args) {

        System.out.println("\nVisibilidade Propriedades da PublicClass");
        PublicClass publicClass = new PublicClass();
        publicClass.propriedadePublica = "ACESSIVEL EM QUALQUER CANTO!";
        publicClass.propriedadeProtegida = "ACESSIVEL POIS ESTAMOS CHAMANDO DENTRO DO MESMO PACOTE";
        publicClass.propriedadePadrao = "ACESSÍVEL POIS ESTAMOS CHAMANDO DENTRO DO MESMO PACOTE";
        // Só é visível/editável dentro chamada dentro da mesma classe
        // Erro de compilação
        //publicClass.propriedadePrivada = "NÃO É POSSÍVEL, POIS ESTÁ LIMITADA A VISUALIZAÇÃO/EDIÇÃO APENAS DENTRO DA MESMA CLASSE";
        publicClass.valoresPropriedades();

        System.out.println("\nVisibilidade Propriedades da InheritedPublicClass (Subclass da PublicClass)");
        InheritedPublicClass inheritedPublicClass = new InheritedPublicClass();
        inheritedPublicClass.propriedadePublica = "ACESSIVEL EM QUALQUER CANTO!";
        inheritedPublicClass.propriedadeProtegida = "ACESSIVEL POIS ESTAMOS CHAMANDO DENTRO DO MESMO PACOTE";
        inheritedPublicClass.propriedadePadrao = "ACESSÍVEL POIS ESTAMOS CHAMANDO DENTRO DO MESMO PACOTE";
        // Só é visível/editável dentro chamada dentro da mesma classe
        // Erro de compilação
        //inheritedPublicClass.propriedadePrivada = "NÃO É POSSÍVEL A CHAMADA, POIS NEM A SUBCLASSE TEM ACESSO, APESAR DE HERDADE";
        inheritedPublicClass.valoresPropriedades();


        // OS MESMOS MODIFICADORES PODEM SER UTILIZADOS EM CLASSE
    }


}
