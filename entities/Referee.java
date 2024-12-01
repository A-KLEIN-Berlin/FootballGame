package entities;
// Судья в нашем проекте - главная сущность. Он дает сигнал (свисток) и игра начинается.
import org.springframework.stereotype.Component;

@Component
public class Referee {
    private Goalkeeper goalkeeper;
    private Defender defender;
    private Midfielder midfielder;
    private Forward forward;
    private Coach coach;

    public Referee(Goalkeeper goalkeeper, Defender defender, Midfielder midfielder, Forward forward, Coach coach) {
        this.goalkeeper = goalkeeper;
        this.defender = defender;
        this.midfielder = midfielder;
        this.forward = forward;
        this.coach = coach;
    }

    public void startGame() {
        System.out.println("Судья дает свисток.");
        goalkeeper.kickBall();
        defender.passBall();
        midfielder.passBall();
        forward.scoreGoal();
        coach.cheer();
    }
}