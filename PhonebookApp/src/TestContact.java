import javax.swing.*;

public class TestContact {
    public static void main(String[] args) {
        Contact[] contacts = new Contact[7];

        contacts[0] = new Contact("Foo1","Bar1","1111111");
        contacts[1] = new Contact("Foo2","Bar2","2222222");
        contacts[2] = new Contact("Foo3","Bar3","3333333");
        contacts[3] = new Contact("Foo4","Bar4","4444444");
        contacts[4] = new Contact("Foo5","Bar5","5555555");

        int index = 5;
        while ( true ){
            String firstName = JOptionPane.showInputDialog("Enter First Name");
            String lastName = JOptionPane.showInputDialog("Enter Last Name");


            if ( isFull(contacts) ) {
                JOptionPane.showMessageDialog(null,"Memory Full");
                display(contacts);
                break;
            } else if ( !isAvailable(contacts, firstName, lastName) ) {
                String contactNo = JOptionPane.showInputDialog("Enter Contact no");
                contacts[index] = new Contact(firstName, lastName, contactNo);
                index++;
                display(contacts);
            } else if ( isAvailable(contacts, firstName, lastName) ) {
                JOptionPane.showMessageDialog(null, "Contact already exists.");
            }
        }

    }

    public static boolean isAvailable( Contact[] contacts, String firstName, String lastName ){
        for( Contact contact : contacts ){
            if ( contact != null){
                if ( contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName) ){
                    return true;
                }
            }

        }
        return false;
    }

    public static boolean isFull(Contact[] contacts){
        int content = 0;
        for (Contact contact  : contacts){
            if ( contact != null ){
                content++;
            }
        }

        if ( content == contacts.length ){
            return true;
        } else {
            return false;
        }
    }

    public static void display(Contact[] contacts) {
        String content = "";
        for ( Contact contact : contacts ){
            if ( contact != null ) {
                content += contact + "\n";
            }

        }
        JOptionPane.showMessageDialog(null, content);
    }
}
