package ex8.Soldiers.SpecialisedSoldiers;

import ex8.Interfaces.ISpecialisedSoldier;
import ex8.Soldiers.BasicSoldiers.Private;

public abstract class SpecialisedSoldier extends Private implements ISpecialisedSoldier {
    private String corps;

    protected SpecialisedSoldier(String id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary);
        this.setCorps(corps);
    }

    private void setCorps(String corps) {
        this.corps = corps;
    }

    @Override
    public String getCorps() {
        return this.corps;
    }
}
