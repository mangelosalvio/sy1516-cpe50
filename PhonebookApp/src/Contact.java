public class Contact {
    private String firstName, lastName, contactNo;

    public Contact(String firstName, String lastName, String contactNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNo = contactNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getContactNo() {
        return contactNo;
    }

    @Override
    public String toString() {
        return this.lastName + ", " + this.firstName + " - " + this.contactNo;
    }
}
