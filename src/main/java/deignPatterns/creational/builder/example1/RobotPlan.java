package deignPatterns.creational.builder.example1;

//Roboto kurimo instrukcija, aprasyta kontraktr - interfeise
public interface RobotPlan {

    void setRobotHead(String head);
    void setRobotBody(String body);
    void setRobotLegs(String legs);
    void setRobotHands(String hands);
}
