package template;

public class VegetarianHoagie extends Hoagie {
    @Override
    boolean customerWantsMeat() {
        return false;
    }

    @Override
    boolean customerWantsCheese() {
        return false;
    }

    @Override
    boolean customerWantsVeggies() {
        return super.customerWantsVeggies();
    }

    @Override
    void addMeat() { }

    @Override
    void addCheese() { }

    @Override
    void addVeggies() {
        System.out.println("adding veggies for vegetarian");
    }
}
