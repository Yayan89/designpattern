package facade;

public class Main {
    public static void main(String[] args) {
        BankFacade bankFacade = new BankFacade();
        bankFacade.checkAccount();
        bankFacade.checkFunds();
        bankFacade.checkSecurity();

    }
}
