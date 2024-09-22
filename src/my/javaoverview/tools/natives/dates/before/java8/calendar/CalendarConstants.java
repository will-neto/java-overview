package my.javaoverview.tools.natives.dates.before.java8.calendar;

import java.util.Calendar;

public class CalendarConstants {
    public static void main(String[] args) {
        // A classe abstrata Calendar possui inumeras constantes que podem auxiliar durante a utilização de métodos
        // da mesma

        // É importante a utilização de constantes em métodos que solicitem, pois alguns países podem ter diferenças
        // na específicação de datas/horas

        System.out.println("\n== Medidas temporais ==");

        System.out.println("Calendar.ERA = + " + Calendar.ERA);
        System.out.println("Calendar.YEAR = + " + Calendar.YEAR);
        System.out.println("Calendar.MONTH = + " + Calendar.MONTH);
        System.out.println("Calendar.WEEK_OF_YEAR = + " + Calendar.WEEK_OF_YEAR);
        System.out.println("Calendar.WEEK_OF_MONTH = + " + Calendar.WEEK_OF_MONTH);
        System.out.println("Calendar.DATE = + " + Calendar.DATE);
        System.out.println("Calendar.DAY_OF_MONTH = + " + Calendar.DAY_OF_MONTH);
        System.out.println("Calendar.DAY_OF_YEAR = + " + Calendar.DAY_OF_YEAR);
        System.out.println("Calendar.DAY_OF_WEEK = + " + Calendar.DAY_OF_WEEK);
        System.out.println("Calendar.DAY_OF_WEEK_IN_MONTH = + " + Calendar.DAY_OF_WEEK_IN_MONTH);
        System.out.println("Calendar.AM_PM = + " + Calendar.AM_PM);
        System.out.println("Calendar.HOUR = + " + Calendar.HOUR);
        System.out.println("Calendar.HOUR_OF_DAY = + " + Calendar.HOUR_OF_DAY);
        System.out.println("Calendar.MINUTE = + " + Calendar.MINUTE);
        System.out.println("Calendar.SECOND = + " + Calendar.SECOND);
        System.out.println("Calendar.MILLISECOND = + " + Calendar.MILLISECOND);
        System.out.println("Calendar.ZONE_OFFSET = + " + Calendar.ZONE_OFFSET);
        System.out.println("Calendar.DST_OFFSET = + " + Calendar.DST_OFFSET);
        System.out.println("Calendar.FIELD_COUNT = + " + Calendar.FIELD_COUNT);

        System.out.println("\n== Meses ==");

        System.out.println("Calendar.JANUARY = " + Calendar.JANUARY);
        System.out.println("Calendar.FEBRUARY = " + Calendar.FEBRUARY);
        System.out.println("Calendar.MARCH = " + Calendar.MARCH);
        System.out.println("Calendar.APRIL = " + Calendar.APRIL);
        System.out.println("Calendar.MAY = " + Calendar.MAY);
        System.out.println("Calendar.JUNE = " + Calendar.JUNE);
        System.out.println("Calendar.JULY = " + Calendar.JULY);
        System.out.println("Calendar.AUGUST = " + Calendar.AUGUST);
        System.out.println("Calendar.SEPTEMBER = " + Calendar.SEPTEMBER);
        System.out.println("Calendar.OCTOBER = " + Calendar.OCTOBER);
        System.out.println("Calendar.NOVEMBER = " + Calendar.NOVEMBER);
        System.out.println("Calendar.DECEMBER = " + Calendar.DECEMBER);
        System.out.println("Calendar.UNDECIMBER = + " + Calendar.UNDECIMBER);

        System.out.println("\n== Dias da Semana ==");

        System.out.println("Calendar.FRIDAY = + " + Calendar.FRIDAY);
        System.out.println("Calendar.MONDAY = + " + Calendar.MONDAY);
        System.out.println("Calendar.TUESDAY = + " + Calendar.TUESDAY);
        System.out.println("Calendar.THURSDAY = + " + Calendar.THURSDAY);
        System.out.println("Calendar.WEDNESDAY = + " + Calendar.WEDNESDAY);
        System.out.println("Calendar.SATURDAY = + " + Calendar.SATURDAY);
        System.out.println("Calendar.SUNDAY = + " + Calendar.SUNDAY);

        System.out.println("\n== Formato de horas ==");

        System.out.println("Calendar.AM = " + Calendar.AM);
        System.out.println("Calendar.PM = " + Calendar.PM);

        System.out.println("\n== Estilos de formatações ao exibir datas ==");

        System.out.println("Calendar.ALL_STYLES = " + Calendar.ALL_STYLES);
        System.out.println("Calendar.SHORT = " + Calendar.SHORT);
        System.out.println("Calendar.LONG = " + Calendar.LONG);
        System.out.println("Calendar.NARROW_FORMAT = " + Calendar.NARROW_FORMAT);
        System.out.println("Calendar.NARROW_STANDALONE = " + Calendar.NARROW_STANDALONE);
        System.out.println("Calendar.SHORT_FORMAT = " + Calendar.SHORT_FORMAT);
        System.out.println("Calendar.LONG_FORMAT = " + Calendar.LONG_FORMAT);
        System.out.println("Calendar.SHORT_STANDALONE = " + Calendar.SHORT_STANDALONE);
        System.out.println("Calendar.LONG_STANDALONE = " + Calendar.LONG_STANDALONE);
    }
}
