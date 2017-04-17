package models;

import observer.ObservableTarget;

public interface Attacker {
    void attack();
    void setTarget(ObservableTarget target);
}
