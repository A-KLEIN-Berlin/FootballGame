import config.AppConfig;
import entities.Referee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// Главный класс в нашем проекте! Здесь запускается приложение.
public class MainApp {
    public static void main(String[] args) {
        // Создание контекста Spring с использованием класса конфигурации:
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Получение бина Referee (судья) из контекста:
        Referee referee = context.getBean(Referee.class);

        // Начало игры:
        referee.startGame();

        // Закрытие контекста после завершения работы.
        context.close();
    }
}

// ВЫВОД ИНФОРМАЦИИ В КОНСОЛЬ:
// Судья дает свисток.
// Вратарь выбивает мяч в поле.
// Защитник передает мяч полузащитнику.
// Полузащитник передает мяч нападающему.
// Нападающий забивает гол!
// Тренер радуется!