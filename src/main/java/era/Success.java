package era;

public class Success implements Event {


    public Success(String desc) {

    }

    public ActionType actionType(){
        return ActionType.SUCCESS;
    }
}
