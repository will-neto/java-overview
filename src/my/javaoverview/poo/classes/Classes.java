package my.javaoverview.poo.classes;

public class Classes {
    public static void main(String[] args) {

        System.out.println("== Classes ==");

        System.out.println("== Declaração e inicialização de instância de classe interna (Classe Interna)\n");

        Pessoa instanciaPessoa = new Pessoa();
        instanciaPessoa.id = 1010;
        instanciaPessoa.nome = "Jubileu";
        instanciaPessoa.apresentarSe();

        Alien instanciaAlien = new Alien();
        instanciaAlien.id = 1011;
        instanciaAlien.nome = "Et Bilu";
        instanciaAlien.apresentarSe();

    }

    // Classe de escopo interno
    // Apenas visivel internamente pela classe "Classes" devido sua declaração interna + modificador de acesso "private"
    private static class Pessoa {
        // Propriedades
        public int id;
        public String nome;

        // Métodos
        public void apresentarSe(){
            System.out.println("\t- @" + this.id +  ": Olá, sou " + this.nome);
        }
    }
}
