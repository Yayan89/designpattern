package strategy;

public class Main {
    public static void main(String[] args) {
        Animal sparky = new Dog();
        Animal larry = new Bird();
        System.out.println(sparky.tryTOfly());
        System.out.println(larry.tryTOfly());


        sparky.setfLysType(new ItFLys());
        System.out.println(sparky.tryTOfly());

    }
}
