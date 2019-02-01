package behavioural.Visitor;

import java.math.BigDecimal;

public interface VisitableEntity {
    BigDecimal accept(Visitor visitor);
}
