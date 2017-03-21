package ex8.Soldiers;

import ex8.Interfaces.ILeutenantGeneral;
import ex8.Soldiers.BasicSoldiers.Private;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeutenantGeneral extends Private implements ILeutenantGeneral {
    private List<Soldier> privates;
    public LeutenantGeneral(String id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new ArrayList<>();
    }

    private List<Soldier> getPrivates(){
        return Collections.unmodifiableList(this.privates);
    }

    @Override
    public void addPrivate(Soldier prv) {
        this.privates.add(prv);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(System.lineSeparator());
        sb.append("Privates:");

        for (Soldier soldier : this.getPrivates()) {
            sb.append(String.format("%n  ")).append(soldier.toString());
        }
        return sb.toString();

    }
}
