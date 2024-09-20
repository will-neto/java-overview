package my.javaoverview.poo.access.modifiers;

public class PublicClass {

    // Acesso em qualquer lugar, dentro e fora do pacote.
    public String propriedadePublica;

    // Acesso restrito à própria classe.
    private String propriedadePrivada;

    // Acesso à própria classe, subclasses e classes no mesmo pacote (salvo exceção se subclasse estiver em outro pacote).
    protected String propriedadeProtegida;

    // (package-private) Acesso apenas dentro do mesmo pacote (nem mesmo subclasses em outros pacotes podem vê-la)
    String propriedadePadrao;

    public void valoresPropriedades(){

        System.out.println("\tpropriedadePublica = " + propriedadePublica);
        System.out.println("\tpropriedadePrivada = " + propriedadePrivada);
        System.out.println("\tpropriedadeProtegida = " + propriedadeProtegida);
        System.out.println("\tpropriedadePadrao = " + propriedadePadrao);

    }
}
