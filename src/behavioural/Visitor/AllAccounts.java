package behavioural.Visitor;

import java.math.BigDecimal;
import java.util.List;

public class AllAccounts implements VisitableEntity {
    List<VisitableEntity> accounts;
    public List<VisitableEntity> getAccounts() {
        return accounts;
    }

    public AllAccounts(List<VisitableEntity> accounts) {
        this.accounts = accounts;
    }


    @Override
    public BigDecimal accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
