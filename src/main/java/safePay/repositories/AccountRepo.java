package safePay.repositories;

import Exceptions.DatabaseConnectionFailedException;
import safePay.Model.Account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccountRepo {

    public AccountRepo() {
        String url = "jdbc:mysql://localhost:3306/safe_pay?createDatabaseIfNotExist=true";
        String username = "root";
        String password = "FavourMiracle";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection:: " + connection);
        } catch (SQLException e) {
            throw new DatabaseConnectionFailedException(e.getMessage());

        }
    }
}

