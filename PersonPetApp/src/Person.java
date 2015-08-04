import java.util.ArrayList;

public class Person {
    private String firstName, lastName;
    private ArrayList<Pet> pets;

    public Person(){
        pets = new ArrayList<Pet>();
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        pets = new ArrayList<Pet>();

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    @Override
    public String toString() {
        String content =  this.lastName + ", " + this.firstName + "\n";
        if ( this.pets.size() <= 0 ){
            content += "\tNo pets\n";
        } else {
            for( Pet pet : this.pets ){
                content += "\t" + pet;
            }
        }

        return content;

    }
}
