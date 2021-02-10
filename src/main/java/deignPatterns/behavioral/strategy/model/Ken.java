package deignPatterns.behavioral.strategy.model;

import deignPatterns.behavioral.strategy.jumping.JumpingBehavior;
import deignPatterns.behavioral.strategy.punching.PunchingBehavior;

public class Ken extends Fighter{
    public Ken(PunchingBehavior punchingBehavior, JumpingBehavior jumpingBehavior) {
        super(punchingBehavior, jumpingBehavior);
    }
}
