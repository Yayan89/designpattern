package adapterdesign;

public class Main {
    public static void main(String[] args) {
        /*
            Use the logic from another class
         */
        Charger charger = new ChargerImpl();
        Android android = new Android();
        android.setCharger(charger);
        android.charge();
    }
}
