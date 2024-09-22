package my.javaoverview.tools.natives.dates.before.java8.formats;

import java.sql.SQLOutput;
import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest {
    public static void main(String[] args) {

        System.out.println("== Date Format ==");
        // DateFormat é a classe abstrata que era utilizada antes do java 8 para trabalhar com formatações de datas

        DateFormat[] formats = new DateFormat[8];

        // Todos os métodos de instâncias da classe DateFormat retornam um objeto do tipo concreto SimpleDateFormat
        // ** Por padrão, o DateFormat utiliza a localidade do sistema **

        formats[0] = DateFormat.getInstance(); // dd/MM/yyyy HH:mm
        formats[1] = DateFormat.getDateInstance(); // Descritivo sem tempo e com abreviação (EQUIVALENTE A MEDIUM)
        formats[2] = DateFormat.getDateTimeInstance(); // Descritivo com Tempo
        formats[3] = DateFormat.getDateInstance(DateFormat.DEFAULT); // Descritivo sem Tempo e com abreviação (EQUIVALENTE A MEDIUM)
        formats[4] = DateFormat.getDateInstance(DateFormat.SHORT); // dd/MM/yyyy
        formats[5] = DateFormat.getDateInstance(DateFormat.MEDIUM); // Descritivo sem Tempo e com abreviação
        formats[6] = DateFormat.getDateInstance(DateFormat.LONG); // Descritivo sem Tempo e sem abreviação
        formats[7] = DateFormat.getDateInstance(DateFormat.FULL); // Descritivo completo

        for(DateFormat format: formats){
            System.out.println("Classe concreta = " + format.getClass());
        }


    }
}
