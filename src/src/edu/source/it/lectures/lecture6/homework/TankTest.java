package src.edu.source.it.lectures.lecture6.homework;

/**
 * Created by VVLM on 25.03.2017.
 */
public class TankTest {
    public static void main(String[] args) {
        Tank tank = new Tank(2);
        tank.fire();
        tank.load();
        tank.load();
        tank.fire();
        tank.load();
        tank.fire();
        tank.load();
    }
}

