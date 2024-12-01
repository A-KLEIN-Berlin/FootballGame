package entities;
// Защитник "зависит" от вратаря, который именно ему передает мяч.

import org.springframework.stereotype.Component;

@Component
public class Defender {

    public void passBall() {
        System.out.println("Защитник передает мяч полузащитнику.");
    }
}
