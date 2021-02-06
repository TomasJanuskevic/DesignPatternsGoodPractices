package goodPractices.solid.dependencyInversion;

/**
 * Solid
 *
 * D - dependency Inversion principle
 *
 * HIgher level modules should not be dependant on Lower Level Modules.
 *
 * Instead both higher and lower level modules should be dependant on absstraction
 *
 * Manager - higher level
 * Developer - lower level modules
 */
public class Manager {

    private Employee employee;

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void manage(){
        employee.work();
    }
}
