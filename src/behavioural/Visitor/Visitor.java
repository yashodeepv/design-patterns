package behavioural.Visitor;

import java.math.BigDecimal;

public interface Visitor {
    BigDecimal visit(SavingAccount savingAccount);
    BigDecimal visit(CurrentAccount currentAccount);
    BigDecimal visit(CreditCardAccount creditCardAccount);
    BigDecimal visit(AllAccounts allAccounts);
}