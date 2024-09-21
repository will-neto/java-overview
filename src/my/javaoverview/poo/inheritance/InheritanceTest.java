package my.javaoverview.poo.inheritance;

public class InheritanceTest {
    public static void main(String[] args) {

        System.out.println("\n== Herança ==");

        Person person = new Person("Euromar", 28);
        Employee employee = new Employee("Pedroso", 23);
        Person employee2 = new Employee("Guilhermino", 32);

        person.apresentarSe();
        employee.apresentarSe(); // método sobrescrito na classe filha
        employee2.apresentarSe(); // método sobrescrito na classe filha

        System.out.println("\n== Sobrescrita de método ==");

        person.metodoFalsamenteSobrescrito();
        employee.metodoFalsamenteSobrescrito(); // chama filho
        employee.metodoFalsamenteSobrescritoComAssinaturaDiferente(); // chama pai
        employee.metodoFalsamenteSobrescritoComAssinaturaDiferente(true); // chama filho
        employee.apresentarSe(); // método realmente sobrescrito

        employee.metodoNaoPodeSerSobrescrito();

    }
}
