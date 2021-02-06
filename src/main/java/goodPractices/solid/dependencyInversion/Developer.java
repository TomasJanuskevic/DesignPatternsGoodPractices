package goodPractices.solid.dependencyInversion;

/**
 * Lower level module
 */
public class Developer implements Employee {
    public void work() {
        System.out.println("Developer working");
    }
}
