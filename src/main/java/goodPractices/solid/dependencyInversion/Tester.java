package goodPractices.solid.dependencyInversion;

public class Tester implements Employee{
    @Override
    public void work() {
        System.out.println("Tester working");
    }
}
