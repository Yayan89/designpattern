package composite;

public class Main {
    public static void main(String[] args) {
        Component hd = new Leaf(300);
        Component mouse = new Leaf(100);
        Component monitor = new Leaf(240);

        Composite ph = new Composite("Peri");
        Composite cabinet = new Composite("Cabinet");
        Composite computer = new Composite("Computer");

        ph.add(mouse);
        ph.add(monitor);
        cabinet.add(hd);
        computer.add(ph);
        computer.add(cabinet);

        ph.showPrice();
        computer.showPrice();
    }
}
