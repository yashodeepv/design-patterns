package behavioural.Visitor;

import java.math.BigDecimal;

public class CreditCardAccount implements VisitableEntity {

    BigDecimal balance;

    public CreditCardAccount(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public BigDecimal accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

