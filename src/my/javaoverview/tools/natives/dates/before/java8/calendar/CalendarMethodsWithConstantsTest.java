package my.javaoverview.tools.natives.dates.before.java8.calendar;

import java.util.Calendar;
import java.util.Locale;

public class CalendarMethodsWithConstantsTest {
    public static void main(String[] args) {

        System.out.println("==  Métodos Calendário com Constantes ==");

        Calendar agora = Calendar.getInstance();

        calendarSet(agora);
        calendarGet(agora);
        calendarGetActualMinMax(agora);
        calendarDisplaysNames(agora);

        // NOTE: muitos métodos para incluir.. Fica uma descrição dos restantes
        /*
            getDisplayName(int field, int style, Locale locale)	Retorna o nome da representação textual do campo especificado, em um determinado estilo e localidade.
            getGreatestMinimum(int field)	Retorna o maior valor mínimo para o campo especificado.
            getLeastMaximum(int field)	Retorna o menor valor máximo para o campo especificado.
            getMaximum(int field)	Retorna o maior valor possível para o campo especificado, sem considerar a data atual.
            getMinimum(int field)	Retorna o menor valor possível para o campo especificado, sem considerar a data atual.
            clear(int field)	Remove a informação do campo específico, retornando-o ao seu valor padrão.
            isSet(int field)	Verifica se o campo especificado foi definido ou não.
            roll(int field, boolean up)	Adiciona ou subtrai uma unidade do campo especificado, sem alterar campos mais altos.
            setFirstDayOfWeek(int value)	Define o primeiro dia da semana.
            setMinimalDaysInFirstWeek(int value)	Define o número mínimo de dias que a primeira semana do ano deve ter.
            setTime(Date date)	Define a data do objeto Calendar com base em um objeto Date.
            setTimeInMillis(long millis)	Define a data do objeto Calendar com base no valor em milissegundos desde 1 de janeiro de 1970.
            setTimeZone(TimeZone zone)	Define o fuso horário do objeto Calendar.
            setWeekDate(int weekYear, int weekOfYear, int dayOfWeek)	Define a data da semana com base no ano da semana, número da semana e dia da semana.
         */
    }

    private static void calendarSet(Calendar agora) {
        System.out.println("\n== Calendar.set() == ");

        agora = Calendar.getInstance();

        // Altera o ano
        System.out.println("\nCalendar.set com YEAR");
        System.out.println("agora = " + agora.getTime());
        agora.set(Calendar.YEAR, 1);
        System.out.println("agora = " + agora.getTime());
        agora = Calendar.getInstance();

        // Alterá o mês
        System.out.println("\nCalendar.set com MONTH");
        System.out.println("agora = " + agora.getTime());
        agora.set(Calendar.MONTH, Calendar.MAY);
        System.out.println("agora = " + agora.getTime());
        agora = Calendar.getInstance();

        // Altera a data (dia do mês)
        System.out.println("\nCalendar.set com DATE");
        System.out.println("agora = " + agora.getTime());
        agora.set(Calendar.DATE, 13);
        System.out.println("agora = " + agora.getTime());
        agora = Calendar.getInstance();

        // Altera a data (dia do mês)
        System.out.println("\nCalendar.set com DATE | DAY_OF_MONTH");
        System.out.println("agora = " + agora.getTime());
        agora.set(Calendar.DATE, 13);
        System.out.println("agora ( Calendar.DATE ) = " + agora.getTime());
        agora.set(Calendar.DAY_OF_MONTH, 13);
        System.out.println("agora ( Calendar.DAY_OF_MONTH ) = " + agora.getTime());
        agora = Calendar.getInstance();

        // Altera o dia da semana do ano (com base no dia da semana atual) => Exemplo, estou no sabado, pega o sabado da semana do ano atribuida
        // 21/09/2024 (Sábado) => Passada a primeira (1) semana do ano => Sábado da primeira semana do ano => 13/01/2024
        System.out.println("\nCalendar.set com WEEK_OF_YEAR");
        System.out.println("agora = " + agora.getTime());
        agora.set(Calendar.WEEK_OF_YEAR, 1);
        System.out.println("agora = " + agora.getTime());
        agora = Calendar.getInstance();

        // Altera o dia da semana do mês (com base no dia da semana atual) => Exemplo, estou no sabado, pega o sabado da semana do mês atribuida
        // 21/09/2024 (Sábado) => Passada a primeira (1) semana do mês  => Sábado da primeira semana do mês => 07/09/2024
        System.out.println("\nCalendar.set com WEEK_OF_MONTH");
        System.out.println("agora = " + agora.getTime());
        agora.set(Calendar.WEEK_OF_MONTH, 1);
        System.out.println("agora = " + agora.getTime());
        agora = Calendar.getInstance();

        // Altera o dia do ano
        System.out.println("\nCalendar.set com DAY_OF_YEAR");
        System.out.println("agora = " + agora.getTime());
        agora.set(Calendar.DAY_OF_YEAR, 365);
        System.out.println("agora = " + agora.getTime());

        // Demais constantes...

        // Calendar.DAY_OF_YEAR
        // Calendar.DAY_OF_WEEK
        // Calendar.DAY_OF_WEEK_IN_MONTH
        // Calendar.AM_PM
        // Calendar.HOUR
        // Calendar.HOUR_OF_DAY
        // Calendar.MINUTE
        // Calendar.SECOND
        // Calendar.MILLISECOND
        // Calendar.ZONE_OFFSET
        // Calendar.DST_OFFSET

        // Natal - 00 horas (meia-noite)
        agora.set(2024, Calendar.DECEMBER, 25);
        System.out.println(agora.getTime());

        // Natal - 8 horas (AM)
        agora.set(2024, Calendar.DECEMBER, 25, 8, 30);
        System.out.println(agora.getTime());

        // Natal - 8 horas (PM)
        agora.set(2024, Calendar.DECEMBER, 25, 20, 30, 30);
        System.out.println(agora.getTime());

    }

    private static void calendarGet(Calendar agora){

        System.out.println("\n== Calendar.get() == ");

        agora = Calendar.getInstance();

        System.out.println("agora = " + agora.getTime());
        System.out.println("Calendar.YEAR = " + agora.get(Calendar.YEAR));
        System.out.println("Calendar.MONTH = " + agora.get(Calendar.MONTH));
        System.out.println("Calendar.WEEK_OF_YEAR = " + agora.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Calendar.WEEK_OF_MONTH = " + agora.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Calendar.DATE = " + agora.get(Calendar.DATE));
        System.out.println("Calendar.DAY_OF_MONTH = " + agora.get(Calendar.DAY_OF_MONTH));
        System.out.println("Calendar.DAY_OF_YEAR = " + agora.get(Calendar.DAY_OF_YEAR));
        System.out.println("Calendar.DAY_OF_WEEK = " + agora.get(Calendar.DAY_OF_WEEK));
    }

    private static void calendarGetActualMinMax(Calendar agora){

        System.out.println("== getActualMinimum() e getActualMaximum() ==");

        agora = Calendar.getInstance();

        // Retornam o menor e maior valor por estrutura Temporal
        // Se baseiam no calendário atual. Porém, algumas verificações, por exemplo de ERA, trará a ERA 0, apesar da data ser atual
        System.out.println("Calendar.ERA -> getActualMinimum() = " + agora.getActualMinimum(Calendar.ERA) + " | getActualMaximum() = " + agora.getActualMaximum(Calendar.ERA)); // 0 - antes de cristo | 1 - depois de cristo
        System.out.println("Calendar.YEAR -> getActualMinimum() = " + agora.getActualMinimum(Calendar.YEAR) + " | getActualMaximum() = " + agora.getActualMaximum(Calendar.YEAR)); // 1 e 292278993
        System.out.println("Calendar.MONTH -> getActualMinimum() = " + agora.getActualMinimum(Calendar.MONTH) + " | getActualMaximum() = " + agora.getActualMaximum(Calendar.MONTH)); // 0 e 11
        System.out.println("Calendar.WEEK_OF_YEAR -> getActualMinimum() = " + agora.getActualMinimum(Calendar.WEEK_OF_YEAR) + " | getActualMaximum() = " + agora.getActualMaximum(Calendar.WEEK_OF_YEAR));
        System.out.println("Calendar.WEEK_OF_MONTH -> getActualMinimum() = " + agora.getActualMinimum(Calendar.WEEK_OF_MONTH) + " | getActualMaximum() = " + agora.getActualMaximum(Calendar.WEEK_OF_MONTH));
        System.out.println("Calendar.DATE -> getActualMinimum() = " + agora.getActualMinimum(Calendar.DATE) + " | getActualMaximum() = " + agora.getActualMaximum(Calendar.DATE));
        System.out.println("Calendar.DAY_OF_MONTH -> getActualMinimum() = " + agora.getActualMinimum(Calendar.DAY_OF_MONTH) + " | getActualMaximum() = " + agora.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println("Calendar.DAY_OF_YEAR -> getActualMinimum() = " + agora.getActualMinimum(Calendar.DAY_OF_YEAR) + " | getActualMaximum() = " + agora.getActualMaximum(Calendar.DAY_OF_YEAR));
        System.out.println("Calendar.DAY_OF_WEEK -> getActualMinimum() = " + agora.getActualMinimum(Calendar.DAY_OF_WEEK) + " | getActualMaximum() = " + agora.getActualMaximum(Calendar.DAY_OF_WEEK));
        System.out.println("Calendar.DAY_OF_WEEK_IN_MONTH -> getActualMinimum() = " + agora.getActualMinimum(Calendar.DAY_OF_WEEK_IN_MONTH) + " | getActualMaximum() = " + agora.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("Calendar.AM_PM -> getActualMinimum() = " + agora.getActualMinimum(Calendar.AM_PM) + " | getActualMaximum() = " + agora.getActualMaximum(Calendar.AM_PM));
        System.out.println("Calendar.HOUR -> getActualMinimum() = " + agora.getActualMinimum(Calendar.HOUR) + " | getActualMaximum() = " + agora.getActualMaximum(Calendar.HOUR));
        System.out.println("Calendar.HOUR_OF_DAY -> getActualMinimum() = " + agora.getActualMinimum(Calendar.HOUR_OF_DAY) + " | getActualMaximum() = " + agora.getActualMaximum(Calendar.HOUR_OF_DAY));
        System.out.println("Calendar.MINUTE -> getActualMinimum() = " + agora.getActualMinimum(Calendar.MINUTE) + " | getActualMaximum() = " + agora.getActualMaximum(Calendar.MINUTE));
        System.out.println("Calendar.SECOND -> getActualMinimum() = " + agora.getActualMinimum(Calendar.SECOND) + " | getActualMaximum() = " + agora.getActualMaximum(Calendar.SECOND));
        System.out.println("Calendar.MILLISECOND -> getActualMinimum() = " + agora.getActualMinimum(Calendar.MILLISECOND) + " | getActualMaximum() = " + agora.getActualMaximum(Calendar.MILLISECOND));
        System.out.println("Calendar.ZONE_OFFSET -> getActualMinimum() = " + agora.getActualMinimum(Calendar.ZONE_OFFSET) + " | getActualMaximum() = " + agora.getActualMaximum(Calendar.ZONE_OFFSET));

    }

    private static void calendarDisplaysNames(Calendar agora) {
        System.out.println("\n\n== Displays ==");

        agora = Calendar.getInstance();

        Locale locale = new Locale("pt", "BR");

        // Exibe a parte da data no formato escolhido - ALL_STYLES - e com base no local atribuido
        System.out.println("getDisplayNames(.., ALL_STYLES, pt_BR) = " + agora.getDisplayNames( Calendar.ERA, Calendar.ALL_STYLES, locale) );
        System.out.println("getDisplayNames(.., ALL_STYLES, pt_BR) = " + agora.getDisplayNames( Calendar.YEAR, Calendar.ALL_STYLES, locale) );
        System.out.println("getDisplayNames(.., ALL_STYLES, pt_BR) = " + agora.getDisplayNames( Calendar.MONTH, Calendar.ALL_STYLES, locale) );
        System.out.println("getDisplayNames(.., ALL_STYLES, pt_BR) = " + agora.getDisplayNames( Calendar.WEEK_OF_YEAR, Calendar.ALL_STYLES, locale) );
        System.out.println("getDisplayNames(.., ALL_STYLES, pt_BR) = " + agora.getDisplayNames( Calendar.WEEK_OF_MONTH, Calendar.ALL_STYLES, locale) );
        System.out.println("getDisplayNames(.., ALL_STYLES, pt_BR) = " + agora.getDisplayNames( Calendar.DATE, Calendar.ALL_STYLES, locale) );
        System.out.println("getDisplayNames(.., ALL_STYLES, pt_BR) = " + agora.getDisplayNames( Calendar.DAY_OF_MONTH, Calendar.ALL_STYLES, locale) );
        System.out.println("getDisplayNames(.., ALL_STYLES, pt_BR) = " + agora.getDisplayNames( Calendar.DAY_OF_YEAR, Calendar.ALL_STYLES, locale) );
        System.out.println("getDisplayNames(.., ALL_STYLES, pt_BR) = " + agora.getDisplayNames( Calendar.DAY_OF_WEEK, Calendar.ALL_STYLES, locale) );
        System.out.println("getDisplayNames(.., ALL_STYLES, pt_BR) = " + agora.getDisplayNames( Calendar.DAY_OF_WEEK_IN_MONTH, Calendar.ALL_STYLES, locale) );
        System.out.println("getDisplayNames(.., ALL_STYLES, pt_BR) = " + agora.getDisplayNames( Calendar.AM_PM, Calendar.ALL_STYLES, locale) );
        System.out.println("getDisplayNames(.., ALL_STYLES, pt_BR) = " + agora.getDisplayNames( Calendar.HOUR, Calendar.ALL_STYLES, locale) );
        System.out.println("getDisplayNames(.., ALL_STYLES, pt_BR) = " + agora.getDisplayNames( Calendar.HOUR_OF_DAY, Calendar.ALL_STYLES, locale) );
        System.out.println("getDisplayNames(.., ALL_STYLES, pt_BR) = " + agora.getDisplayNames( Calendar.MINUTE, Calendar.ALL_STYLES, locale) );
        System.out.println("getDisplayNames(.., ALL_STYLES, pt_BR) = " + agora.getDisplayNames( Calendar.SECOND, Calendar.ALL_STYLES, locale) );
        System.out.println("getDisplayNames(.., ALL_STYLES, pt_BR) = " + agora.getDisplayNames( Calendar.MILLISECOND, Calendar.ALL_STYLES, locale) );
        System.out.println("getDisplayNames(.., ALL_STYLES, pt_BR) = " + agora.getDisplayNames( Calendar.ZONE_OFFSET, Calendar.ALL_STYLES, locale) );

        // Exibe a parte da data no formato escolhido - SHORT - e com base no local atribuido
        System.out.println("getDisplayNames(.., SHORT, pt_BR) = " + agora.getDisplayNames( Calendar.ERA, Calendar.SHORT, locale) );
        System.out.println("getDisplayNames(.., SHORT, pt_BR) = " + agora.getDisplayNames( Calendar.YEAR, Calendar.SHORT, locale) );
        System.out.println("getDisplayNames(.., SHORT, pt_BR) = " + agora.getDisplayNames( Calendar.MONTH, Calendar.SHORT, locale) );
        System.out.println("getDisplayNames(.., SHORT, pt_BR) = " + agora.getDisplayNames( Calendar.WEEK_OF_YEAR, Calendar.SHORT, locale) );
        System.out.println("getDisplayNames(.., SHORT, pt_BR) = " + agora.getDisplayNames( Calendar.WEEK_OF_MONTH, Calendar.SHORT, locale) );
        System.out.println("getDisplayNames(.., SHORT, pt_BR) = " + agora.getDisplayNames( Calendar.DATE, Calendar.SHORT, locale) );
        System.out.println("getDisplayNames(.., SHORT, pt_BR) = " + agora.getDisplayNames( Calendar.DAY_OF_MONTH, Calendar.SHORT, locale) );
        System.out.println("getDisplayNames(.., SHORT, pt_BR) = " + agora.getDisplayNames( Calendar.DAY_OF_YEAR, Calendar.SHORT, locale) );
        System.out.println("getDisplayNames(.., SHORT, pt_BR) = " + agora.getDisplayNames( Calendar.DAY_OF_WEEK, Calendar.SHORT, locale) );
        System.out.println("getDisplayNames(.., SHORT, pt_BR) = " + agora.getDisplayNames( Calendar.DAY_OF_WEEK_IN_MONTH, Calendar.SHORT, locale) );
        System.out.println("getDisplayNames(.., SHORT, pt_BR) = " + agora.getDisplayNames( Calendar.AM_PM, Calendar.SHORT, locale) );
        System.out.println("getDisplayNames(.., SHORT, pt_BR) = " + agora.getDisplayNames( Calendar.HOUR, Calendar.SHORT, locale) );
        System.out.println("getDisplayNames(.., SHORT, pt_BR) = " + agora.getDisplayNames( Calendar.HOUR_OF_DAY, Calendar.SHORT, locale) );
        System.out.println("getDisplayNames(.., SHORT, pt_BR) = " + agora.getDisplayNames( Calendar.MINUTE, Calendar.SHORT, locale) );
        System.out.println("getDisplayNames(.., SHORT, pt_BR) = " + agora.getDisplayNames( Calendar.SECOND, Calendar.SHORT, locale) );
        System.out.println("getDisplayNames(.., SHORT, pt_BR) = " + agora.getDisplayNames( Calendar.MILLISECOND, Calendar.SHORT, locale) );
        System.out.println("getDisplayNames(.., SHORT, pt_BR) = " + agora.getDisplayNames( Calendar.ZONE_OFFSET, Calendar.SHORT, locale) );


        // Exibe a parte da data no formato escolhido - NARROW_FORMAT - e com base no local atribuido
        System.out.println("getDisplayNames(.., NARROW_FORMAT, pt_BR) = " + agora.getDisplayNames( Calendar.ERA, Calendar.NARROW_FORMAT, locale) );
        System.out.println("getDisplayNames(.., NARROW_FORMAT, pt_BR) = " + agora.getDisplayNames( Calendar.YEAR, Calendar.NARROW_FORMAT, locale) );
        System.out.println("getDisplayNames(.., NARROW_FORMAT, pt_BR) = " + agora.getDisplayNames( Calendar.MONTH, Calendar.NARROW_FORMAT, locale) );
        System.out.println("getDisplayNames(.., NARROW_FORMAT, pt_BR) = " + agora.getDisplayNames( Calendar.WEEK_OF_YEAR, Calendar.NARROW_FORMAT, locale) );
        System.out.println("getDisplayNames(.., NARROW_FORMAT, pt_BR) = " + agora.getDisplayNames( Calendar.WEEK_OF_MONTH, Calendar.NARROW_FORMAT, locale) );
        System.out.println("getDisplayNames(.., NARROW_FORMAT, pt_BR) = " + agora.getDisplayNames( Calendar.DATE, Calendar.NARROW_FORMAT, locale) );
        System.out.println("getDisplayNames(.., NARROW_FORMAT, pt_BR) = " + agora.getDisplayNames( Calendar.DAY_OF_MONTH, Calendar.NARROW_FORMAT, locale) );
        System.out.println("getDisplayNames(.., NARROW_FORMAT, pt_BR) = " + agora.getDisplayNames( Calendar.DAY_OF_YEAR, Calendar.NARROW_FORMAT, locale) );
        System.out.println("getDisplayNames(.., NARROW_FORMAT, pt_BR) = " + agora.getDisplayNames( Calendar.DAY_OF_WEEK, Calendar.NARROW_FORMAT, locale) );
        System.out.println("getDisplayNames(.., NARROW_FORMAT, pt_BR) = " + agora.getDisplayNames( Calendar.DAY_OF_WEEK_IN_MONTH, Calendar.NARROW_FORMAT, locale) );
        System.out.println("getDisplayNames(.., NARROW_FORMAT, pt_BR) = " + agora.getDisplayNames( Calendar.AM_PM, Calendar.NARROW_FORMAT, locale) );
        System.out.println("getDisplayNames(.., NARROW_FORMAT, pt_BR) = " + agora.getDisplayNames( Calendar.HOUR, Calendar.NARROW_FORMAT, locale) );
        System.out.println("getDisplayNames(.., NARROW_FORMAT, pt_BR) = " + agora.getDisplayNames( Calendar.HOUR_OF_DAY, Calendar.NARROW_FORMAT, locale) );
        System.out.println("getDisplayNames(.., NARROW_FORMAT, pt_BR) = " + agora.getDisplayNames( Calendar.MINUTE, Calendar.NARROW_FORMAT, locale) );
        System.out.println("getDisplayNames(.., NARROW_FORMAT, pt_BR) = " + agora.getDisplayNames( Calendar.SECOND, Calendar.NARROW_FORMAT, locale) );
        System.out.println("getDisplayNames(.., NARROW_FORMAT, pt_BR) = " + agora.getDisplayNames( Calendar.MILLISECOND, Calendar.NARROW_FORMAT, locale) );
        System.out.println("getDisplayNames(.., NARROW_FORMAT, pt_BR) = " + agora.getDisplayNames( Calendar.ZONE_OFFSET, Calendar.NARROW_FORMAT, locale) );

    }

}