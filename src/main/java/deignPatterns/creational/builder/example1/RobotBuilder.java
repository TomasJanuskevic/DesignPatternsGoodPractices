package deignPatterns.creational.builder.example1;
/*
Apsirasome standartinius veiksmus robotui sukurti
 */
public interface RobotBuilder {
    void buildRobotHead();
    void buildRobotBody();
    void buildRobotLegs();
    void buildRobotHands();
    Robot getRobot();
}
