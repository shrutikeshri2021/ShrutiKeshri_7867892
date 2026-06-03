import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateCollegeDb {

    public static void main(String[] args) {
        String url = "jdbc:sqlite:college.db";

        String createTable = "CREATE TABLE IF NOT EXISTS students("
                + "id INTEGER,"
                + "name TEXT"
                + ");";

        String insertRahul = "INSERT INTO students VALUES(101,'Rahul');";
        String insertPriya = "INSERT INTO students VALUES(102,'Priya');";
        String insertAman = "INSERT INTO students VALUES(103,'Aman');";

        try (Connection connection = DriverManager.getConnection(url);
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(createTable);
            statement.executeUpdate("DELETE FROM students;");
            statement.executeUpdate(insertRahul);
            statement.executeUpdate(insertPriya);
            statement.executeUpdate(insertAman);

            System.out.println("college.db created and students table populated.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
