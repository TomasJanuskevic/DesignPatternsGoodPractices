package deignPatterns.creational.builder;
/**
Builder (Creational) is used to create objects made from other objects.
 When you need to create objects which consist of other objects
 Builder knows the specifics of creation of those objects
 */

public class BuilderMain {

    // Let's say we are creating a game with robots.
    public static void main(String[] args) {
        RobotBuilder builder = new OldRobotBuilder(); //sukureme stakles robotui gaminti

        RobotEngineer engineer = new RobotEngineer(builder);

        engineer.constructRobot();

        Robot pirmasisRobotas = engineer.getRobot();
        System.out.println(pirmasisRobotas);

        engineer = new RobotEngineer(new TeslaRobotBuilder());
        engineer.constructRobot();
    }
}
