package strategy.java8;

import strategy.Flys;

public class Eagle {
    private Flys flys;

    public Eagle(Flys flys) {
        this.flys = flys;
    }

    public void fly() {
        System.out.println(flys.fly());
    }

}
