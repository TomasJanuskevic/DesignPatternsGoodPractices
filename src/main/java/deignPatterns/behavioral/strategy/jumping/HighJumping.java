package deignPatterns.behavioral.strategy.jumping;

public class HighJumping implements JumpingBehavior {

    @Override
    public void jump() {
        System.out.println("Jumping very high!");
    }
}
