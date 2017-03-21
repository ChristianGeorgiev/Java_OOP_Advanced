package ex8.Soldiers;

import ex8.Interfaces.ISoldier;

public abstract class Soldier implements ISoldier{
    private String id;
    private String firstName;
    private String lastName;

    protected Soldier(String id, String firstName, String lastName){
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    private void setId(String id) {
        this.id = id;
    }

    private void setFirstName(String firstName) {
        if (firstName.isEmpty() || firstName.trim().length() == 0){
            throw new IllegalArgumentException("Name can not be empty!");
        }
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        if (lastName.isEmpty() || lastName.trim().length() == 0){
            throw new IllegalArgumentException("Name can not be empty!");
        }
        this.lastName = lastName;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }
}
