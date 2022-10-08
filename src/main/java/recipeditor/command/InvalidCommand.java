package recipeditor.command;

import recipeditor.ui.Ui;

public class InvalidCommand extends Command {
    public static final String TYPE = "invalid";
    public static String message;

    public CommandResult execute() {
        //TODO: Execution of command
        // This is only the dummy code for testing
        message = TYPE + "\n" + Ui.COMMAND;
        return new CommandResult(message);
    }

}
