package deignPatterns.behavioral.strategy.punching;

public class WeakPunching implements PunchingBehavior {
    @Override
    public void punch() {
        System.out.println("Punching very weak. Like a child!");
    }
}
