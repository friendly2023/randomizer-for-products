import db.TestConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // Это простая демонстрация для того, чтобы приложение не завершилось сразу
        System.out.println("Приложение запущено. Контейнер будет оставаться активным.");
        Connection connection = TestConnection.makeConnection();
        assert connection != null;
        // Бесконечный цикл для удержания процесса в работе
    }
}
