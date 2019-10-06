package template;

public abstract class Hoagie {
    public final void makeSandwich() {
        cutBun();

        if (customerWantsMeat()) {
            addMeat();
        }
        if(customerWantsCheese()) {
            addCheese();
        }
        if(customerWantsVeggies()) {
            addVeggies();
        }
    }

    private void cutBun() {

    }

    abstract void addMeat();
    abstract void addCheese();
    abstract void addVeggies();

    boolean customerWantsMeat() {
        return true;
    }

    boolean customerWantsCheese() {
        return true;
    }

    boolean customerWantsVeggies() {
        return true;
    }

}
