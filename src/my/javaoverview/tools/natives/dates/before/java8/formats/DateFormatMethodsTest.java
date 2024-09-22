package my.javaoverview.tools.natives.dates.before.java8.formats;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.util.Date;

public class DateFormatMethodsTest {
    public static void main(String[] args) {
        System.out.println("== Métodos da classe SimpleDateFormat ==");

        DateFormat formatador = DateFormat.getInstance();
        Date date = new Date();
        StringBuffer sb = new StringBuffer();

        // Formata com base no modelo do getIstance();
        System.out.println("format(date) = " + formatador.format(date));
        // Obtem um objeto de classe Calendar específico da data
        System.out.println("getCalendar() = " + formatador.getCalendar());
        // Obtem um objeto de classe TimeZone específico da data
        System.out.println("getTimeZone() = " + formatador.getTimeZone());

        System.out.println("== Uso de format com StringBuffer (sem rastreio) ==");
        // Insere a data formatada em um objeto StringBuffer
        // É passado FieldPosition(0), pois não precisamos rastrear nenhuma informação
        formatador.format(date, sb, new FieldPosition(0));
        System.out.println("sb = " + sb);

        System.out.println("== Uso de format com StringBuffer (com rastreio) ==");
        // Exemplo fazendo rastreio de ano e data
        sb = new StringBuffer();
        FieldPosition fp = new FieldPosition(DateFormat.YEAR_FIELD);
        formatador.format(date, sb, fp);
        System.out.println("sb = " + sb);
        System.out.println("fp (YEAR_FIELD) = index inicio:" + fp.getBeginIndex() + " | index fim: " + fp.getEndIndex());

        sb = new StringBuffer();
        fp = new FieldPosition(DateFormat.MONTH_FIELD);
        formatador.format(date, sb, fp);
        System.out.println("sb = " + sb);
        System.out.println("fp (MONTH_FIELD) = index inicio:" + fp.getBeginIndex() + " | index fim: " + fp.getEndIndex());

        sb = new StringBuffer();
        fp = new FieldPosition(DateFormat.MINUTE_FIELD);
        formatador.format(date, sb, fp);
        System.out.println("sb = " + sb);
        System.out.println("fp (MINUTE_FIELD) = index inicio:" + fp.getBeginIndex() + " | index fim: " + fp.getEndIndex());

    }
}
