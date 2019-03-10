import java.util.List;

public class DataManager {

    private List<State> states;

    public DataManager() {

    }

    public void addState(State s) {
        states.add(s);
    }

    public State getState(int index) {
        return states.get(index);
    }

}
