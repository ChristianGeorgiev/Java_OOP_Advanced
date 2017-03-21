package ex8.Soldiers.SpecialisedSoldiers;

import ex8.Interfaces.ICommando;
import ex8.Soldiers.SpecialisedSoldiers.Activities.Mission;

import java.util.*;

public class Commando extends SpecialisedSoldier implements ICommando {
    List<Mission> missions;

    public Commando(String id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.missions = new ArrayList<>();
    }

    private List<Mission> getMissions() {
        return Collections.unmodifiableList(this.missions);
    }

    @Override
    public void addMission(Mission mission) {
        this.missions.add(mission);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(System.lineSeparator());
        sb.append(String.format("Corps: %s%nMissions:", super.getCorps()));
        for (Mission mission : this.getMissions()) {
            sb.append(System.lineSeparator()).append(mission.toString());
        }
        return sb.toString();
    }
}
