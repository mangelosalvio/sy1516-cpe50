public class Person {
    private Person mother, father;
    private String firstName, lastName, address;
    private int age;

    /**
     * Default constructor to set default values of the object
     */
    public Person() {

        /**
         * Mother and Father instantiated for it to be used automatically
         * after instantiating this Person.
         */

        this.mother = new Person();
        this.father = new Person();
    }

    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;

        this.mother = new Person();
        this.father = new Person();
    }

    public Person(String lastName, String firstName, String address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;

        this.mother = new Person();
        this.father = new Person();
    }

    public Person(String lastName, String firstName, String address, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.age = age;

        this.mother = new Person();
        this.father = new Person();
    }

    public Person(String lastName, String firstName, String address, int age, Person mother, Person father) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.age = age;
        this.mother = mother;
        this.father = father;
    }

    public void setFatherName(String lastName, String firstName){
        this.getFather().setLastName(lastName);
        this.getFather().setFirstName(firstName);

        /**
         * Alternately, you can also do this
         */

        /*this.father.firstName = firstName;
        this.father.lastName = lastName;*/
    }

    public void setMotherName(String lastName, String firstName){
        this.getMother().setLastName(lastName);
        this.getMother().setFirstName(firstName);

        /**
         * Alternately, you can also do this
         */

        /*this.mother.firstName = firstName;
        this.mother.lastName = lastName;*/
    }

    /**
     * Overloading Method - setting the last name
     * @param lastName
     */

    public void setName(String lastName){
        this.lastName = lastName;
    }


    /**
     * Overloading Method - setting the last and first name
     * @param lastName
     * @param firstName
     */
    public void setName(String lastName, String firstName){
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
