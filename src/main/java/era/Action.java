package era;

import java.util.List;

public class Action {


    Event success;
    Event failed;
    Event warn;

    String description;

    List<String> commands;

    public Action(String description, String command) {

    }


    public void execute() {

        try {

            // execute
        } catch (Exception e) {

        }


    }


    public Action bind(Action nextAction, Event when) {


        return nextAction;
    }

    public void onSuccess() {

    }
}
