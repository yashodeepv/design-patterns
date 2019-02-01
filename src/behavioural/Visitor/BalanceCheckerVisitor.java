package behavioural.Visitor;

import java.math.BigDecimal;

public class BalanceCheckerVisitor implements Visitor {

    @Override
    public BigDecimal visit(SavingAccount savingAccount) {
        return savingAccount.getBalance();
    }

    @Override
    public BigDecimal visit(CurrentAccount currentAccount) {
        return currentAccount.getBalance();
    }

    @Override
    public BigDecimal visit(CreditCardAccount creditCardAccount) {
        return creditCardAccount.getBalance();
    }

    @Override
    public BigDecimal visit(AllAccounts accounts) {
        return new BigDecimal(accounts.getAccounts().stream()
                .map(a -> a.accept(this))
                .mapToDouble(a -> a.doubleValue()).sum()+"");
    }
}