import com.sun.deploy.util.StringUtils;

/**
 * A program to test StringBuilder Class
 */
public class StringBuilderTest {
    public static void main(String[] args) {

        StringBuilder contentBuilder = new StringBuilder("This is the first line");
        System.out.println(contentBuilder);
        System.out.println();

        /**
         *  I will append a second line
         */

        contentBuilder.append("\nThis is the second line.");
        System.out.println(contentBuilder);
        System.out.println();

        /**
         *  I will append a third line
         */

        Person p = new Person("Foo", "Bar");
        contentBuilder.append("\nI will append ");
        contentBuilder.append(p);
        contentBuilder.append(" on the third line.");
        System.out.println(contentBuilder);
        System.out.println();


        /**
         * Insert on the index specified
         */
        contentBuilder.insert(0, "We ");
        System.out.println(contentBuilder);
        System.out.println();

        /**
         * Insert on the index specified
         */

        contentBuilder.insert(25, "s");
        System.out.println(contentBuilder);
        System.out.println();

        /**
         * Other methods:
         * -delete
         * –remove
         * -replace
         * -reverse
         * - ...
         * ** Please see Java API for the implementation of the other methods.
         */
        
    }


}
