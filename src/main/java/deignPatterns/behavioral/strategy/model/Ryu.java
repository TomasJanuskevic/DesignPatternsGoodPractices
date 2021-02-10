package deignPatterns.behavioral.strategy.model;

import deignPatterns.behavioral.strategy.jumping.JumpingBehavior;
import deignPatterns.behavioral.strategy.punching.PunchingBehavior;

public class Ryu extends Fighter {
    public Ryu(PunchingBehavior punchingBehavior, JumpingBehavior jumpingBehavior) {
        super(punchingBehavior, jumpingBehavior);
    }
}
