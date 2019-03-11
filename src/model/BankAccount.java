package model;

public class BankAccount {
    private User user;
    private String bankType;
    private String bankCardId;
    private Double money;

    public BankAccount(User user, String bankType, String bankCardId, Double money) {
        this.user = user;
        this.bankType = bankType;
        this.bankCardId = bankCardId;
        this.money = money;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getbankType() {
        return this.bankType;
    }

    public void setbankType(String bankType) {
        this.bankType = bankType;
    }

    public String getBankCardId() {
        return this.bankCardId;
    }

    public void setBankCardId(String bankCardId) {
        this.bankCardId = bankCardId;
    }

    public Double getMoney() {
        return this.money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
