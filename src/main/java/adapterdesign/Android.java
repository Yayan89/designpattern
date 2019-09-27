package adapterdesign;

import lombok.Data;

@Data
public class Android {
    private Charger charger;

    public void charge() {
        charger.charge();
    }
}
