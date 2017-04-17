package commands.group;

import commands.Command;
import mediator.AttackGroup;
import models.Target;
import observer.ObservableTarget;

public class GroupTargetCommand implements Command {

    private AttackGroup group;
    private ObservableTarget target;

    public GroupTargetCommand(AttackGroup group, ObservableTarget target) {
        this.group = group;
        this.target = target;
    }

    @Override
    public void execute() {
        this.group.groupTarget(this.target);
    }
}
