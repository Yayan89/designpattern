package facade;

import lombok.AllArgsConstructor;

public class BankFacade {

    private AccountNumberCheck accountNumberCheck;
    private SecurityChecker securityChecker;
    private FundsChecker fundsChecker;

    public BankFacade() {
        this.accountNumberCheck = new AccountNumberCheck();
        this.securityChecker = new SecurityChecker();
        this.fundsChecker = new FundsChecker();
    }

    public void checkAccount() {
        accountNumberCheck.check();
    }

    public void checkSecurity() {
        securityChecker.check();
    }

    public void checkFunds() {
        fundsChecker.check();
    }

}
