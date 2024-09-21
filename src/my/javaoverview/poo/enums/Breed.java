package my.javaoverview.poo.enums;

public enum Breed {

    // Enumeração
    // Usada em cenários onde existe um número limitado ou quase inalterável de um valor no negócio do Sistema
    // Também mantém o código mais declarativo

    // Os enums possuem indices por padrao, começando do 0 e incrementando de 1 em 1
    Dalmata(1) {
        // É possível sobrescrever métodos para itens específicos
        @Override
        public String latirAlto(){
            return "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAUUUUUUUUUUUUUUUUUUUUUU";
        }

    },// Indice 0
    Poodle(2),
    Husky(31),
    GoldenRetriever(54),
    BorderCollie(78),
    SemRacaDefinida(13); // Indice 5

    // Diferente do CSharp, enumerados em Java podem possuir construtores, onde podemos definir campos adicionais e
    // fixos referentes ao mesmo
    Breed(Integer id) {
        this.id = id;
    }

    private final Integer id;

    // Também podem possuir métodos
    public int getId(){
        return id;
    }

    public String latirAlto(){
        return "AU AUUUUUU!!";
    }
}
