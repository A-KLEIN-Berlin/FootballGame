package entities;
// Эмоции тренера "зависят" в нашем проекте от нападающего, который забивает гол.

import org.springframework.stereotype.Component;

@Component
public class Coach {

    public void cheer() {
        System.out.println("Тренер радуется!");
    }
}
