package behavioural.Visitor;

import java.math.BigDecimal;
import java.util.Arrays;

class Main {

    public static void main(String[] args) {

        // List of Accounts held by a someone
        AllAccounts allAccounts = new AllAccounts(Arrays.asList(
                new SavingAccount(new BigDecimal("100")),
                new SavingAccount(new BigDecimal("1000")),
                new CurrentAccount(new BigDecimal("2000")),
                new CurrentAccount(new BigDecimal("3000")),
                new CreditCardAccount(new BigDecimal("-3000"))
        ));

        // Calculate total balance of all accounts
        BigDecimal totalBalance = allAccounts.accept(new BalanceCheckerVisitor());

        System.out.println(totalBalance);

    }
}
