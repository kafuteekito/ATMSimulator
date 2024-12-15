package org.example.atmsimulator;

import javafx.beans.property.*;
public class Account {
    private IntegerProperty accountId;
    private IntegerProperty personId;
    private StringProperty accountType;
    private DoubleProperty balance;

    public Account() {
        this.accountId = new SimpleIntegerProperty();
        this.personId = new SimpleIntegerProperty();
        this.accountType = new SimpleStringProperty();
        this.balance = new SimpleDoubleProperty(0.00);
    }

    public int getAccountId() {
        return accountId.get();
    }

    public IntegerProperty accountIdProperty() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId.set(accountId);
    }

    public int getPersonId() {
        return personId.get();
    }

    public IntegerProperty personIdProperty() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId.set(personId);
    }

    public String getAccountType() {
        return accountType.get();
    }

    public StringProperty accountTypeProperty() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType.set(accountType);
    }

    public double getBalance() {
        return balance.get();
    }

    public DoubleProperty balanceProperty() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance.set(balance);
    }
}