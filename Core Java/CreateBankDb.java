import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateBankDb {

    public static void main(String[] args) {
        String url = "jdbc:sqlite:bank.db";

        String createTable = "CREATE TABLE IF NOT EXISTS accounts(" +
                "id INTEGER," +
                "balance INTEGER" +
                ");";

        try (Connection connection = DriverManager.getConnection(url);
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(createTable);
            statement.executeUpdate("DELETE FROM accounts;");
            statement.executeUpdate("INSERT INTO accounts VALUES(1,10000);");
            statement.executeUpdate("INSERT INTO accounts VALUES(2,5000);");

            System.out.println("bank.db created and accounts table populated.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
