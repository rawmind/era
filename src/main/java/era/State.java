package era;

public interface State {

    Event execute(Action action);

}
