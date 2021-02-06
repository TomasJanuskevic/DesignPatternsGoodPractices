package deignPatterns.creational.builder;
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
