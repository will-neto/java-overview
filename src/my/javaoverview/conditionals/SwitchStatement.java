package my.javaoverview.conditionals;

public class SwitchStatement {
    public static void main(String[] args) {
        System.out.println("Estruturas Condicionais - SWITCH");

        System.out.println("\nSWITCH");


        System.out.println("\n==Verifica regiao==");
        verificarRegiao(11);
        verificarRegiao(41);
        verificarRegiao(88);

        System.out.println("\n==Verifica tipo dia semana==");
        verificarTipoDiaSemana(1);
        verificarTipoDiaSemana(5);
        verificarTipoDiaSemana(100);

    }

    private static void verificarRegiao(int ddd) {
        switch (ddd){
            case 11:
                System.out.println("DDD " + ddd + " = São Paulo");
                break;
            case 13:
                System.out.println("DDD " + ddd + " = São Paulo litoral");
                break;
            case 41:
                System.out.println("DDD " + ddd + " = Paraná");
                break;
            default:
                System.out.println("DDD " + ddd + " = Região não encontrada");
                break;
        }
    }

    private static void verificarTipoDiaSemana(int dia) {
        switch (dia){
            case 1:
            case 7:
                System.out.println("Dia da semana " + dia + " = Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia da semana " + dia + " = Dia útil");
                break;
            default:
                System.out.println("Dia da semana " + dia + " = No calendário gregoriano possuímos apenas 7 dias na semana, rsrs");
                break;
        }
    }
}
