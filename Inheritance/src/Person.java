public class Person {
    private String firstName, lastName;

    /**
     * Without the default constructor,
     * your child will have an error
     */
    public Person(){
        this.firstName = "Foo";
        this.lastName = "Bar";
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return  this.lastName + ", " + this.firstName;
    }

    public void saySomething(){
        System.out.println("something");
    }
}
