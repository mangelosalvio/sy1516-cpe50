public class Test {
    public static void main(String[] args) {

        Person person = new Person("Rommel", "Delgado");
        System.out.println(person);
        person.saySomething();

        System.out.println();

        Employee employee = new Employee(25000, "1234567", "University of St. Scholastica");
        System.out.println(employee);
        System.out.println();

        /**
         * You can also use methods of the parent
         */

        employee.setFirstName("Jeffrey");
        employee.setLastName("Gallegos");
        System.out.println(employee);
        employee.saySomething();
    }
}
