package template.java8;

import java.util.function.Consumer;

public class MainWIthJava8 {
    public static void main(String[] args) {
        new OnlineBankingImp().processCustomer(1, customer -> System.out.println("test"));
    }
}
