package adapterdesign;

import adapterdesign.thirdparty.Iphone;

public class ChargerImpl implements Charger {
    //use composition or inheritance
    private Iphone iphone = new Iphone();

    @Override
    public void charge() {
        iphone.charge();
    }
}
