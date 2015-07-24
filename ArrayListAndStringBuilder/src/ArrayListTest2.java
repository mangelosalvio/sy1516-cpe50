import java.util.ArrayList;

/**
 * A program to test the function of ArrayList on a user defined object.
 */
public class ArrayListTest2 {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();

        /**
         * Add
         */

        persons.add(new Person("Foo", "Bar"));
        System.out.println(persons);

        Person person1 = new Person("Johnny", "Thor");
        persons.add(person1);
        System.out.println(persons);

        persons.add(1, new Person("Monny", "Tor"));
        System.out.println(persons);

        /**
         * Remove
         */

        persons.remove(1);
        System.out.println(persons);

        persons.remove(person1);
        System.out.println(persons);

        /**
         * Get
         */

        Person p1 = persons.get(0);
        System.out.println(p1);
        System.out.println(persons);

        p1.setFirstName("Honey");
        p1.setLastName("Buns");
        System.out.println(persons);

        /**
         * Set
         */

        persons.set(0,new Person("Sub", "Zero"));
        System.out.println(persons);

        /**
         * Get size
         */

        System.out.println("The size of the array list is " + persons.size());


    }

}
