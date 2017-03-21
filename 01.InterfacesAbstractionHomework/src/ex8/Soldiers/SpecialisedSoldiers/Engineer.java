package ex8.Soldiers.SpecialisedSoldiers;

import ex8.Interfaces.IEngineer;
import ex8.Soldiers.SpecialisedSoldiers.Activities.Repair;

import java.util.*;

public class Engineer extends SpecialisedSoldier implements IEngineer {
    List<Repair> repairs;

    public Engineer(String id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new ArrayList<>();
    }

    private List<Repair> getRepairs() {
        return Collections.unmodifiableList(this.repairs);
    }

    @Override
    public void addRepair(Repair repair) {
        this.repairs.add(repair);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(System.lineSeparator());
        sb.append(String.format("Corps: %s%nRepairs:", super.getCorps()));

        for (Repair repair : this.getRepairs()) {
            sb.append(System.lineSeparator()).append(repair.toString());
        }

        return sb.toString();
    }
}
