import javax.swing.*;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<Person>();
        do {
            Person person = new Person();
            person.setFirstName(JOptionPane.showInputDialog("Please enter first name"));
            person.setLastName(JOptionPane.showInputDialog("Please enter last name"));
            persons.add(person);

            /**
             * Ask for pets
             */

            do{
                String petName = JOptionPane.showInputDialog("Please enter pet name");
                if ( petName != null ){

                    String petType = JOptionPane.showInputDialog("Please enter pet type");

                    if ( petType != null ){
                        Pet pet = new Pet(petType, petName);
                        person.getPets().add(pet);

                        display(persons);
                    } else {
                        display(persons);
                    }

                } else {
                    display(persons);
                }

            }while( JOptionPane.showConfirmDialog(null, "Continue to enter a pet?") == JOptionPane.YES_OPTION );


        } while(JOptionPane.showConfirmDialog(null, "Continue to add a person? ") == JOptionPane.YES_OPTION );
        display(persons);
    }

    public static void display(ArrayList<Person> persons){

        String content = "";
        for( Person person : persons ){
            content += person + "-----------------------" + "\n";
        }

        JOptionPane.showMessageDialog(null, new JTextArea(content));

    }
}
