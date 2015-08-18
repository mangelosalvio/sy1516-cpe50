import java.sql.*;

public class SQLiteConsole {

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            /**
             * Create a connection to the database
             */

            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:test.db");

            /**
             * Create Persons table
             */

            statement = connection.createStatement();
            String sql = "create table if not exists persons (" +
                    "id integer primary key," +
                    "first_name text," +
                    "last_name text," +
                    "age integer )";
            statement.executeUpdate(sql);
            statement.executeUpdate("delete from persons");

        } catch (Exception e){
            System.out.println("Cannot connect to database");
            System.out.println(e.getMessage());
        }

        System.out.println("Opened Database successfuly");

        /**
         * Insert data here
         */
        try {
            String sql = "insert into persons (first_name, last_name) values ('Foo','Bar')";
            statement.executeUpdate(sql);

            PreparedStatement preparedStatement = connection.prepareStatement("insert into persons (first_name, last_name) values (?, ?)");
            preparedStatement.setString(1, "Juan");
            preparedStatement.setString(2, "De la Cruz");
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        /**
         * Display data
         */
        try{
            ResultSet resultSet = statement.executeQuery("select * from persons");
            while ( resultSet.next() ){
                System.out.println( resultSet.getString("last_name") + ", " + resultSet.getString("first_name" ) );
            }

        } catch (Exception e){
            e.printStackTrace();
        }


        try {
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
