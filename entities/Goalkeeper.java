package entities;
// Вратарь "зависит" от судьи. Только после свистка судьи вратарь выбивает мяч в поле.

import org.springframework.stereotype.Component;

@Component
public class Goalkeeper {

    public void kickBall() {
        System.out.println("Вратарь выбивает мяч в поле.");
    }
}
