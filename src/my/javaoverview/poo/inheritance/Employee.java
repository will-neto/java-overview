package my.javaoverview.poo.inheritance;

public class Employee extends Person {

    public Employee(String nome, Integer idade) {
        // Chamada semelhante ao base(...) do Csharp
        super(nome, idade);
    }

    // Override permite a sobrescrita de um método
    // Alterar sua assinatura (parâmetros ou retorno) produz um erro de compilação
    @Override
    public void apresentarSe(){
        System.out.println("Olá, sou " + getNome() + " e tenho " + getIdade());
    }

    // Se declararmos um método com a mesma assinatura existente na classe pai sem o @Override, é como se estivessemos
    // criando um método novo. O "resultado" esperado de retornar uma mensagem da classe filha irá funcionar, mas a
    // sobrescrita real não. Tendo em vista que a alteração da assinatura irá expor um novo método
    public void metodoFalsamenteSobrescrito(){
        System.out.println("Método chamado da classe filha");
    }

    // Prova que a alteração da assinatura irá nos expor um novo método no objeto
    public void metodoFalsamenteSobrescritoComAssinaturaDiferente(Boolean teste){
        System.out.println("Método chamado da classe filha");
    }


}
