package deignPatterns.behavioral.strategy.jumping;

public class LowJumping implements JumpingBehavior {
    @Override
    public void jump() {
        System.out.println("Jumping low.");
    }
}
