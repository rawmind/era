package era;


public class ShelCommand implements Action {

    private final String commandString;

    public ShelCommand(String commandString) {
        this.commandString = commandString;
    }

    @Override
    public void execute() {
    }

}
