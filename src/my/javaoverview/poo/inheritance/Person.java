package my.javaoverview.poo.inheritance;

public class Person {
    private String nome;
    private Integer idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Person(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentarSe(){
        System.out.println("Olá, sou " + getNome() + " e tenho " + getIdade());
    }



    public void metodoFalsamenteSobrescrito() {
        System.out.println("Chamado da classe pai");
    }

    public void metodoFalsamenteSobrescritoComAssinaturaDiferente() {
        System.out.println("Chamado da classe pai");
    }


    public final void metodoNaoPodeSerSobrescrito(){
        System.out.println("Não posso ser sobrescrito - chamada feita pela classe pai e nem criado um metodo com mesmo nome");
    }
}
