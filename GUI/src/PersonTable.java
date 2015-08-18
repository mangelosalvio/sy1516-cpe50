import javax.swing.*;
import java.util.ArrayList;

public class PersonTable {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Foo","Bar","foo@example.com","09111111111"));
        persons.add(new Person("Susan","Baker","susan@example.com","09111111112"));
        persons.add(new Person("Skippy","Peanuts","foo@example.com","09111111113"));

        PersonTableModel model = new PersonTableModel(persons);
        JTable table = new JTable(model);
        JOptionPane.showMessageDialog(null, new JScrollPane(table));
    }
}
