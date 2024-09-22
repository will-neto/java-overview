package my.javaoverview.tools.natives.dates.before.java8.calendar;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        System.out.println("== Calendar ==");

        // Classe criada pra tentar fornecer alternativas para falta de funcionalidades da Date
        // Facilita o trabalho com partes diferentes de uma data
        // Suporta fuso-horário
        // É uma classe abstrata e possui 3 subclasses => Calendario Gregoriano, Japones e Budista

        // Recupera uma instancia da subclasse de calendario Gregoriano
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

    }
}
