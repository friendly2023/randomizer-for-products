import db.DatabaseManager;
import db.TestConnection;

import java.sql.SQLException;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws SQLException {
        // Это простая демонстрация для того, чтобы приложение не завершилось сразу
        System.out.println("Приложение запущено. Контейнер будет оставаться активным.");
        System.out.println(

        Objects.requireNonNull(TestConnection.makeConnection()).createStatement()
                .executeQuery("SELECT version();")
        );
        // Бесконечный цикл для удержания процесса в работе
        while (true) {
            try {
                Thread.sleep(1000); // Пауза на 1 секунду, чтобы не загрузить процессор
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
