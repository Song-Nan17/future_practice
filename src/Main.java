import model.User;
import service.BankAccountService;
import service.UserService;

import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        System.out.println("张三和李四的银行账户共有余额：");
        System.out.println(getAccountMoneyByUserId("1") + getAccountMoneyByUserId("2") + " 元");
    }

    public static Double getAccountMoneyByUserId(String id) {
        CompletableFuture<Double> result = getUsersDetail(id)
                .thenCompose(user -> getBankAccountMoney(user));
        return result.join();
    }

    public static CompletableFuture<User> getUsersDetail(String userId) {
        return CompletableFuture.supplyAsync(() -> {
            UserService userService = new UserService();
            return userService.getUser(userId);
        });
    }

    public static CompletableFuture<Double> getBankAccountMoney(User user) {
        return CompletableFuture.supplyAsync(() -> {
            BankAccountService bankAccountService = new BankAccountService();
            return bankAccountService.getAccountMoney(user);
        });
    }


}
