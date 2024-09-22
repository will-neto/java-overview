package my.javaoverview.tools.natives.dates.before.java8.calendar;

import java.util.Calendar;

public class CalendarMethodsTest {
    public static void main(String[] args) {

        System.out.println("== Métodos Calendário ==");
        // Obtem uma instancia de calendario com as configurações do ambiente local
        Calendar agora = Calendar.getInstance();

        System.out.println("getTime() = " + agora.getTime()); // Data em formato longo
        System.out.println("getCalendarType() = " + agora.getCalendarType()); // Tipo do calendário
        System.out.println("getFirstDayOfWeek() = " + agora.getFirstDayOfWeek()); // Primeiro dia da semana. Pode ser domingo ou segunda dependendo do país
        System.out.println("getMinimalDaysInFirstWeek() = " + agora.getMinimalDaysInFirstWeek());
        System.out.println("getTimeInMillis() = " + agora.getTimeInMillis()); // Tempo em milissegundos - Epoch Time
        System.out.println("getTimeZone() = " + agora.getTimeZone()); // Fuso horário
        System.out.println("getWeeksInWeekYear() = " + agora.getWeeksInWeekYear()); // Retorna o número de semanas existentes no ano da semana
        System.out.println("isLenient() = " + agora.isLenient()); // Se true, calendário permite datas inválidas.
        System.out.println("isWeekDateSupported() = " + agora.isWeekDateSupported()); // Se true, calendário permite lidar com datas representadas por semanas
        System.out.println("toInstant() = " + agora.toInstant()); // Retorna um objeto Instante, que é a representação específica no tempo em UTC
        agora.clear();
        System.out.println("clear() = " + agora);

        System.out.println("\n\n== Exemplo leniente ==");
        agora.setLenient(true);
        // Sumariza o mês, jogando pra jan/2025
        agora.set(2024, 12, 01);
        System.out.println(agora.getTime());
        // Sumariza o dia, jogando pra jan/2025
        agora.set(2024, 11, 32);
        System.out.println(agora.getTime());

        /*
            // Se removida datas inválidas,
            agora.setLenient(false);
            // Erro é disparado na linha abaixo
            agora.set(2024, 11, 32);
            System.out.println(agora.getTime());
        */

        System.out.println("\n\n== Exemplo métodos comparativos ==");

        Calendar calendarAnoQueVem = Calendar.getInstance();
        calendarAnoQueVem.set(2025, Calendar.DECEMBER, 31);

        agora = Calendar.getInstance();
        System.out.println("calendarAnoQueVem.compareTo(agora) = " + calendarAnoQueVem.compareTo(agora)); // -1 menor | 0 igual | 1 maior
        System.out.println("calendarAnoQueVem.before(agora) = " + calendarAnoQueVem.before(agora));
        System.out.println("calendarAnoQueVem.after(agora) = " + calendarAnoQueVem.after(agora));

    }
}
