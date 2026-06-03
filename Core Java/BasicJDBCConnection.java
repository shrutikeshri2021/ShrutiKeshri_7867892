import java.sql.*;

public class BasicJDBCConnection {

    public static void main(String[] args) {

        try {

            Class.forName("org.sqlite.JDBC");

            Connection dbLink =
                    DriverManager.getConnection(
                            "jdbc:sqlite:college.db");

            Statement queryBox =
                    dbLink.createStatement();

            ResultSet studentData =
                    queryBox.executeQuery(
                            "select * from students");

            while(studentData.next()) {

                int rollNo =
                        studentData.getInt("id");

                String studentName =
                        studentData.getString("name");

                System.out.println(
                        rollNo + " " + studentName);
            }

            dbLink.close();

        } catch(Exception issue) {

            System.out.println(issue);
        }
    }
}
