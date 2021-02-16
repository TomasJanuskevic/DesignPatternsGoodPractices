package deignPatterns.creational.builder.example1;

public class RobotEngineer {

    private RobotBuilder robotBuilder;

    public RobotEngineer(RobotBuilder robotBuilder) { // cia gali atkieliauti betkokia RobotBuilder implementacija
        this.robotBuilder = robotBuilder;
    }

    public Robot getRobot(){
        return this.robotBuilder.getRobot();
    }

    public void constructRobot(){
        robotBuilder.buildRobotHead();
        robotBuilder.buildRobotBody();
        robotBuilder.buildRobotHands();
        robotBuilder.buildRobotLegs();
    }
}
