package commandExecutors;

import commands.Command;

public class CommandExecutor implements Executor {


    @Override
    public void executeCommand(Command command) {
        command.execute();
    }
}
