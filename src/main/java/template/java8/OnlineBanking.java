package template.java8;

import java.util.function.Consumer;

public abstract class OnlineBanking {

    /**
        Do not use this one, Before java 8
     */
    public void processCustomer(int id){
        Customer c = Database.getCustomerWithId(id);
        makeCustomerHappy(c);
    }
    abstract void makeCustomerHappy(Customer c);
}

class OnlineBankingImp extends OnlineBanking {

    @Override
    void makeCustomerHappy(Customer c) {

    }

    public void processCustomer(int id, Consumer<Customer> makeCustomerHappy){
        Customer c = Database.getCustomerWithId(id);
        makeCustomerHappy.accept(c);
    }
}
