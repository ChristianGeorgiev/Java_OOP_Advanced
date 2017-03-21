package ex8.Soldiers.BasicSoldiers;

import ex8.Interfaces.ISpy;
import ex8.Soldiers.Soldier;

public class Spy extends Soldier implements ISpy{
    private int codeNumber;

    public Spy(String id, String firstName, String lastName, int codeNumber) {
        super(id, firstName, lastName);
        this.setCodeNumber(codeNumber);
    }

    private void setCodeNumber(int codeNumber) {
        this.codeNumber = codeNumber;
    }

    @Override
    public int getCodeNumber() {
        return this.codeNumber;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %s%nCode Number: %d",
                super.getFirstName(), super.getLastName(),
                super.getId(), this.getCodeNumber());
    }
}
