package entities;
// Нападающий "зависит" от полузащитника, от которого он получает мяч.

import org.springframework.stereotype.Component;

@Component
public class Forward {

    public void scoreGoal() {
        System.out.println("Нападающий забивает гол!");
    }
}