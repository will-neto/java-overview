package my.javaoverview.poo.interfaces;

// Funcionam como contratos
// Semelhante as classes abstratas não podem ser instanciados
// Ao contrário de classes abstratas, não possuem construtor. Outro ponto é que uma classe podem implementar múltiplas interfaces
    // já uma classe não pode herdar multiplas classes (normais ou abstratas)
// Uma interface pode implementar outra interface
public interface Automovel {

    // Pode possuir atributos
    // Eles são implicitamentes publicos (public), estáticos (static) e constantes (final)

    public static final int retrovisores = 2;

    // Erro de compilação
    // Não podem ser atribuitos outros modificadores de acessos, são publicos por natureza
    // private int retrovisores = 2;


    // Podem conter métodos abstratos, que deve ser obrigatoriamente sobrescrito pela subclasse
    // a palavra chave abstract é atribuida implicitamente, pois é o estado padrao de um método
    abstract void freiar();

    // Podem conter método default o que não exige obrigatoriedade de sobrescrita
    default void abrirPorta(){
        System.out.println("Abrindo porta!");
        abrindo();
    }

    static void ligarLuz(){
        clicarBotaoLigarLuz();
        System.out.println("Ligando luz!!!");
    }

    // Pode possuir métodos privados também
    // que não são visiveis por subclasses ou por qualquer outra área do código
    private static void clicarBotaoLigarLuz(){
        System.out.println("Clicando botão de ligar luz...");
    }

    // É possível ter métodos normais privados
    private void abrindo() {
        System.out.println("Puxando... Abriu!!");
    }
}
