import java.util.List;

public class State {

    private String name;
    private List<County> counties;

    public State() {

    }

    public String getName() {
        return name;
    }
    public County getCounty(int index) {
        return counties.get(index);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addCounty(County c) {
        counties.add(c);
    }

}
