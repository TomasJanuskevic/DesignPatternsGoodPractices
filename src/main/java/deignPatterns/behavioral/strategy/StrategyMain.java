package deignPatterns.behavioral.strategy;

import deignPatterns.behavioral.strategy.jumping.HighJumping;
import deignPatterns.behavioral.strategy.jumping.LowJumping;
import deignPatterns.behavioral.strategy.model.Fighter;
import deignPatterns.behavioral.strategy.punching.StrongPunching;

/**
 * Strategy pattern defines a family of algorithms
 * Eg. Jumping and Punching are the main actions for the fighter
 * those actions should ve ancapsulated
 * those actions should be interchangable. Tai rieskia, gaime tuos veiksmus lengvai keisti
 * In that case we can change the behavior without affecting the client
 */
public class StrategyMain {
    public static void main(String[] args) {
        //Isivaizduojam, kad pasirenkam kovotoja is meniu
        //Prasideda kova

        //Pagal musu pasirinkima sukuriamas kovotojas
        //kuriant objekta parenkam specifines startegijas
        Fighter fighter = new Fighter(new StrongPunching(), new LowJumping());
        //paspaudziame mygtuka trnktiv
        fighter.punch();
        //paspaudziame mygtuka sokti
        fighter.jump();

        //gavau pastiprinima
        fighter.setJumpingBehavior(new HighJumping());

        fighter.jump();// jau soka aukstai

    }
}
