package observer.java8;

public class MainJava8 {
    public static void main(String[] args) {

        Subject f = new FeedImpl();

        f.registerObserver(tweet -> {
            if(tweet != null && tweet.contains("money")){
                System.out.println("Breaking news in NY! " + tweet);
            }
        });

        f.registerObserver(tweet -> {
            if(tweet != null && tweet.contains("queen")){
                System.out.println("Yet another news in London... " + tweet);
            }
        });
    }
}
