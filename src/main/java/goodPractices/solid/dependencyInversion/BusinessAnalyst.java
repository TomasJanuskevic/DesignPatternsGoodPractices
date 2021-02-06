package goodPractices.solid.dependencyInversion;

public class BusinessAnalyst implements Employee {

    @Override
    public void work() {
        System.out.println("Working as an analyst");
    }
}
