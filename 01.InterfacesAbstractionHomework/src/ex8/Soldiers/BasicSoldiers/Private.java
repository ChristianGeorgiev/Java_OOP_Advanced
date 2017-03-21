package ex8.Soldiers.BasicSoldiers;

import ex8.Interfaces.IPrivate;
import ex8.Soldiers.Soldier;

public class Private extends Soldier implements IPrivate{
    private double salary;

    public Private(String id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.setSalary(salary);
    }

    private void setSalary(double salary) {
        if (salary < 0){
            throw new IllegalArgumentException("Salary can not be negative number!");
        }
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %s Salary: %.2f", super.getFirstName(), super.getLastName(),
                super.getId(), this.getSalary());
    }
}
