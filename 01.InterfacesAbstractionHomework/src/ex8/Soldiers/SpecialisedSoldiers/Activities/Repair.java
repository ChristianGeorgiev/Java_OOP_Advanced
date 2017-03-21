package ex8.Soldiers.SpecialisedSoldiers.Activities;

public class Repair {
    private String partName;
    private int hoursWorked;

    public Repair(String partName, int hoursWorked){
        this.setPartName(partName);
        this.setHoursWorked(hoursWorked);
    }

    private void setPartName(String partName) {
        this.partName = partName;
    }

    private void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString(){
        return String.format("  Part Name: %s Hours Worked: %d", this.partName, this.hoursWorked);
    }
}
