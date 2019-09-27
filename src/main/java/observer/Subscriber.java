package observer;

public class Subscriber {
    private String name;
    private Channel channel;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update() {
        System.out.println("Hey " + name + " Video uploaded");
    }

    public void subscribeChannel(Channel channel) {
        this.channel = channel;
    }

}
