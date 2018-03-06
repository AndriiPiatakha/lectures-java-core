package patterns.creationalpatterns.factorymethod;

public class USSRTankCreator implements TankCreator {

	@Override
    public Tank getTank(String name) {
        if ("T-34".equals(name)) {
            return new T34Tank();
        } else if ("T-35".equals(name)) {
            return new T35Tank();
        } else if ("T-38".equals(name)) {
            return new T38Tank();
        } 
        return null;
    }

}
