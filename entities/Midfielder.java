package entities;
// ПОлузащитник "зависит" от защитника, от которого он получает мяч.

import org.springframework.stereotype.Component;

@Component
public class Midfielder {

    public void passBall() {
        System.out.println("Полузащитник передает мяч нападающему.");
    }
}
