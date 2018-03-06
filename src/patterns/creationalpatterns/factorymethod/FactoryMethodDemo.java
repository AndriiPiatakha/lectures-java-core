package patterns.creationalpatterns.factorymethod;

public class FactoryMethodDemo {

    public static void main(String[] args) {
        TankCreator tankCreator = new USSRTankCreator();
        
        Tank tank = tankCreator.getTank("T-34");
        System.out.println(tank.getDescription());

        tank = tankCreator.getTank("T-35");
        System.out.println(tank.getDescription());

        tank = tankCreator.getTank("T-38");
        System.out.println(tank.getDescription());
    }
}
