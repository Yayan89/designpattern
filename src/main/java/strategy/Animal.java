package strategy;

public class Animal {
    protected Flys fLysType;

    public String tryTOfly() {
        return fLysType.fly();
    }

    public void setfLysType(Flys fLysType) {
        this.fLysType = fLysType;
    }
}
