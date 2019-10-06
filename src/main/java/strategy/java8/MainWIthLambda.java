package strategy.java8;

import strategy.Flys;

public class MainWIthLambda {
    public static void main(String[] args) {
        Eagle eagle = new Eagle(() -> "It can fly for sure with java 8.");
        eagle.fly();
    }
}
