package ex8.Soldiers.SpecialisedSoldiers.Activities;

public class Mission {
    private String codeName;
    private String state;

    public Mission(String codeName, String state){
        this.setCodeName(codeName);
        this.setState(state);
    }

    private void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    private void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString(){
        return String.format("  Code Name: %s State: %s", this.codeName, this.state);
    }
}
