package patterns.creationalpatterns.factorymethod;

public class T38Tank implements Tank {

    private static final String NAME = "T-38";
    private static final String COUNTRY = "USSR";

    public String getDescription() {
        return NAME + " " + COUNTRY;
    }
}