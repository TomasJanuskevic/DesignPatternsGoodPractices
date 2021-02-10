package deignPatterns.behavioral.strategy.model;

import deignPatterns.behavioral.strategy.jumping.HighJumping;
import deignPatterns.behavioral.strategy.jumping.JumpingBehavior;
import deignPatterns.behavioral.strategy.punching.PunchingBehavior;

//super class
//can be abstract or interface as well. Depends on your approach and design
public class Fighter {
    //Fighter can jump or punch
    PunchingBehavior punchingBehavior;
    JumpingBehavior jumpingBehavior;

    public Fighter(PunchingBehavior punchingBehavior, JumpingBehavior jumpingBehavior) {
        this.punchingBehavior = punchingBehavior;
        this.jumpingBehavior = jumpingBehavior;
    }

    public Fighter(PunchingBehavior punchingBehavior) {
        this.punchingBehavior = punchingBehavior;
    }

    public void punch() {
        punchingBehavior.punch(); //jei bus implementacija StrongPunching - trenks stipriai
        //jei WeakPunching - trenks silpnai
    }

    public void jump() {
        jumpingBehavior.jump();
    }


    public void setJumpingBehavior(JumpingBehavior jumpingBehavior) {
        this.jumpingBehavior = jumpingBehavior;
    }
}
