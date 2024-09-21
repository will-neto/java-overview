package my.javaoverview.poo.errors.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;

public class MultilineExceptionTest {
    public static void main(String[] args) {

        try{
            int error = new Random().nextInt(1, 3);

            if (error == 1)
                throw new SQLException("Erro no banco de dados");
            else
                throw new FileNotFoundException("Erro de arquivo");

        } catch (SQLException | FileNotFoundException e) { // Especificando na mesma linha dois erros pra um catch
            System.out.println(e);
        }

        try{
            int error = new Random().nextInt(1, 3);

            if (error == 1)
                throw new SQLException("Erro no banco de dados");
            else
                throw new FileNotFoundException("Erro de arquivo");

        }
        // Erro de compilação, pois FileNotFoundException é subclass de IOException
        // Não colocar classes que estejam na mesma linha de herança
        catch (SQLException | FileNotFoundException | NullPointerException | IndexOutOfBoundsException e) {
            System.out.println(e);
        }


    }

}
