package composite;

public class Leaf implements Component {
    private int price;

    public Leaf(int price) {
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println(price);
    }
}
