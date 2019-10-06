package template;

public class ItalianHoagie extends Hoagie {
    @Override
    void addMeat() {
        System.out.println("adding meat....");
    }

    @Override
    void addCheese() {
        System.out.println("adding cheeses");
    }

    @Override
    void addVeggies() {
        System.out.println("adding veggies for italian");
    }
}
