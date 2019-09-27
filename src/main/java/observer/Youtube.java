package observer;

public class Youtube {
    public static void main(String[] args) {
        Channel javaTutorials = new Channel();
        Subscriber s1 = new Subscriber("Arak");
        Subscriber s2 = new Subscriber("Dak");
        Subscriber s3 = new Subscriber("Dip");

        javaTutorials.subscribe(s1);
        javaTutorials.subscribe(s2);
        javaTutorials.subscribe(s3);

        s1.subscribeChannel(javaTutorials);
        s2.subscribeChannel(javaTutorials);
        s3.subscribeChannel(javaTutorials);

        javaTutorials.upload("Observer pattern");
    }
}
