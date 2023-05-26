package safePay.Model;

import java.math.BigDecimal;

public class Account {

    private int id;
    private String name;
    private BigDecimal balance;

    public Account(String name, BigDecimal balance) {
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
