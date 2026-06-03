import java.sql.*;

public class StudentDAO {

    Connection dbLink;

    public StudentDAO() throws Exception {

        Class.forName("org.sqlite.JDBC");

        dbLink =
                DriverManager.getConnection(
                        "jdbc:sqlite:college.db");
    }

    public void insertStudent(
            int studentId,
            String studentName)
            throws Exception {

        PreparedStatement addData =
                dbLink.prepareStatement(
                        "insert into students values(?,?)");

        addData.setInt(1, studentId);
        addData.setString(2, studentName);

        addData.executeUpdate();
    }

    public void updateStudent(
            int studentId,
            String studentName)
            throws Exception {

        PreparedStatement modifyData =
                dbLink.prepareStatement(
                        "update students set name=? where id=?");

        modifyData.setString(1, studentName);
        modifyData.setInt(2, studentId);

        modifyData.executeUpdate();
    }

    public static void main(String[] args)
            throws Exception {

        StudentDAO studentBox =
                new StudentDAO();

        studentBox.insertStudent(
                101,
                "Rahul");

        studentBox.updateStudent(
                101,
                "Amit");

        System.out.println(
                "Student Record Updated");
    }
}
