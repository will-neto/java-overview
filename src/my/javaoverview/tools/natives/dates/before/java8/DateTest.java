package my.javaoverview.tools.natives.dates.before.java8;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        // Classe usada antes do java 8
        // Foi descontinuada devido problemas de mutabilidade, falta de intuitividade devido não fornecer métodos necessários
        //  para manipulação de dados, não suportar fuso horário, etc.
        // Baseada no Epoch Time / Unix Time

        Date date = new Date(1_000_000_000_000L);

        System.out.println("Data atribuida com Unix time = " + date);

        Date agora = new Date();


        System.out.println("Data Completa = " + agora);
        System.out.println("Data = " + agora.getDate());
        System.out.println("Mês = " + agora.getMonth());
        System.out.println("Ano = " + agora.getYear());
        System.out.println("Data Completa (baseada no idioma da aplicação) = " + agora.toLocaleString());
        System.out.println("Dia da semana = " + agora.getDay());
        System.out.println("Horas  = " + agora.getHours());
        System.out.println("Minutos = " + agora.getMinutes());
        System.out.println("Segundos = " + agora.getSeconds());
        // Diferença em minutos do Horário UTC - Horário Local
        // UTC = Coordinated Universal Time (UTC) => Baseado no meridiano de greenwich
        System.out.println("Diferença em minutos do horário local (da aplicação) com o UTC => (UTC - Local) = " + agora.getTimezoneOffset());

        // Para adicionar ou remover horas/minutos/segundos deve ser usado esquema de milissegundos, o que nao torna a biblioteca intuitiva
        agora.setTime(agora.getTime() + 3_600_000);
        System.out.println(agora);

    }
}
