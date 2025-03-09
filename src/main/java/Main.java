

public class Main {
    public static void main(String[] args) {
        // Это простая демонстрация для того, чтобы приложение не завершилось сразу
        System.out.println("Приложение запущено. Контейнер будет оставаться активным.");

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
