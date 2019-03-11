package service;

import model.BankAccount;
import model.User;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class BankAccountService {

    private BankAccount[] accountArray = {new BankAccount(new User("张三", "1"), "农业银行", "123", 100.00),
            new BankAccount(new User("李四", "2"), "建设银行", "234", 500.00)};
    private List<BankAccount> accounts = Arrays.asList(accountArray);

    public Double getAccountMoney(User user) {
        OptionalDouble optional = this.accounts.stream()
                .filter(account -> account.getUser().equals(user))
                .mapToDouble(x -> x.getMoney()).findFirst();
        return optional.orElse(0.00);
    }

    public String getAccountBankType(User user) {
        Optional optional = this.accounts.stream()
                .filter(account -> account.getUser().equals(user))
                .map(x -> x.getbankType()).findFirst();
        return optional.orElse(null).toString();
    }
}
