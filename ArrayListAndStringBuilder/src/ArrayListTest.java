import java.util.ArrayList;

/**
 * A program to test the function of ArrayList
 */
public class ArrayListTest {
    public static void main(String[] args) {

        /**
         * You cannot use ArrayList to store int, double, float, or other primitive data types
         */

        /**
         * The bottom statement will create an error
         */

        // ArrayList<int> numbers = new ArrayList<int>();

        /**
         * To Create an ArrayList to store strings
         */

        ArrayList<String> names = new ArrayList<String>();
        names.add("Billy");
        names.add("Joe");
        names.add("Joseph");

        System.out.println(names);

        /**
         * To insert into a portion of the list
         * -- inserts before joe
         */

        names.add(1,"Mike");

        /**
         * To insert into a portion of the list
         * -- inserts before jospeh
         */

        names.add(3,"Raphael");

        System.out.println(names);

        /**
         * checks the size of the array list
         */
        System.out.println("The size of the ArrayList is " + names.size());

        /**
         * Remove the specified index from the list
         * -- remove Joe
         */

        names.remove(2);
        System.out.println(names);

        /**
         * Remove Joseph
         */
        names.remove(3);
        System.out.println(names);

        /**
         * Change Mike to Michael
         */

        names.set(1,"Michael");
        System.out.println(names);

        /**
         * Change Raphael to Ralph
         */

        names.set(2, "Ralph");
        System.out.println(names);

        /**
         * Get the specified index from the list and store in a string variable
         */
        String firstName = names.get(1);
        System.out.println(names);
        System.out.println(firstName);

        /**
         * Remove Billy
         */
        names.remove("Billy");
        System.out.println(names);


    }
}
