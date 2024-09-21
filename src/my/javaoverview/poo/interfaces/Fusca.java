package my.javaoverview.poo.interfaces;

// Podem implementar mais de uma interface
// Diferente de classes onde só podem uma (independente se normal ou abstrata)
public class Fusca implements Automovel, Reliquia {


    @Override
    public void freiar() {
        System.out.println("Olhando através dos " + Automovel.retrovisores + " e apertando bem forte pra freiar" +
                "( aliás, é um fusca com as pastilhas de freios bem desgastadas hehe )");
    }

    @Override
    public void abrirPorta() {
        Automovel.super.abrirPorta();
    }

    // Não temos acesso ao método clicarBotaoLigarLuz() por ser privado


}
