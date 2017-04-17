package mediator;

import models.Attacker;
import models.Target;
import observer.ObservableTarget;

public interface AttackGroup {
    void addMember(Attacker attacker);
    void groupTarget(ObservableTarget target);
    void groupAttack();
}
