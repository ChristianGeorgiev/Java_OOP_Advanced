import commandExecutors.CommandExecutor;
import commandExecutors.Executor;
import commands.group.GroupAttackCommand;
import commands.group.GroupTargetCommand;
import loggers.CombatLogger;
import loggers.EventLogger;
import loggers.Logger;
import mediator.AttackGroup;
import mediator.Group;
import models.Attacker;
import models.Dragon;
import models.Warrior;
import observer.ObservableTarget;

public class Main {
    public static void main(String[] args) {
        Logger combatLogger = new CombatLogger();
        Logger eventLogger = new EventLogger();

        combatLogger.setSuccessor(eventLogger);

        Attacker warrior = new Warrior("Warrior", 20, combatLogger);
        ObservableTarget dragon = new Dragon("Drakonche", 40, 200, combatLogger);

        AttackGroup group = new Group();
        group.addMember(warrior);
        group.addMember(new Warrior("Gosho", 123, combatLogger));

        Executor executor = new CommandExecutor();
        executor.executeCommand(new GroupTargetCommand(group, dragon));
        executor.executeCommand(new GroupAttackCommand(group));
    }
}
