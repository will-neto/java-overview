package my.javaoverview.poo.finalkey;

// Em classes, indica que não pode ser herdada
public final class FinalKeyClass {
    // Campo deve ter inicialização inline ou via construtor

    public final String campoNaoPodeTerValorAlteradoEDeveSerInicializado = "INICIALIZAÇÃO OBRIGATORIA";
    public final String campoNaoPodeTerValorAlteradoEDeveSerInicializado2;

    public FinalKeyClass() {
        campoNaoPodeTerValorAlteradoEDeveSerInicializado2 = "INICIALIZAÇÃO OBRIGATÓRIA";
    }

    // metodos com final nao podem ser sobrescrito
    // devido a classe está como "final", nao é obrigatorio a indicação disso em métodos tb
    public final void metodoNaoPodeSerSobrescrito(){
        System.out.println(campoNaoPodeTerValorAlteradoEDeveSerInicializado);
        System.out.println(campoNaoPodeTerValorAlteradoEDeveSerInicializado2);
    }
}

