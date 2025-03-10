package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {
    public static Connection makeConnection() {
        System.out.println("🔄 Попытка подключения к базе данных...");

        try (Connection connection = DatabaseManager.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT version();")) {

            if (resultSet.next()) {
                System.out.println("✅ Подключение успешно!");
                System.out.println("PostgreSQL версия: " + resultSet.getString(1));
            } else {
                System.out.println("❌ Не удалось получить версию PostgreSQL.");
            }
            return connection;

        } catch (SQLException e) {
            System.out.println("❌ Ошибка подключения к БД: " + e.getMessage());
            e.printStackTrace();
        }

        return null;
    }
}

