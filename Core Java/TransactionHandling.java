import java.sql.*;

public class TransactionHandling {

    public static void transferMoney(
            int senderId,
            int receiverId,
            int amount) {

        try {

            Class.forName("org.sqlite.JDBC");

            Connection bankConnection =
                    DriverManager.getConnection(
                            "jdbc:sqlite:bank.db");

            bankConnection.setAutoCommit(false);

            PreparedStatement debitAmount =
                    bankConnection.prepareStatement(
                            "update accounts set balance = balance - ? where id = ?");

            debitAmount.setInt(1, amount);
            debitAmount.setInt(2, senderId);

            debitAmount.executeUpdate();

            PreparedStatement creditAmount =
                    bankConnection.prepareStatement(
                            "update accounts set balance = balance + ? where id = ?");

            creditAmount.setInt(1, amount);
            creditAmount.setInt(2, receiverId);

            creditAmount.executeUpdate();

            bankConnection.commit();

            System.out.println(
                    "Money Transfer Successful");

            bankConnection.close();

        } catch (Exception problem) {

            System.out.println(
                    "Transaction Failed");
        }
    }

    public static void main(String[] args) {

        transferMoney(
                1,
                2,
                1000);
    }
}
