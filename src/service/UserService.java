package service;

import model.User;

import java.util.Arrays;
import java.util.List;

public class UserService {

    private User[] userArray = {new User("张三", "1"), new User("李四", "2"), new User("王五", "3")};
    private List<User> users = Arrays.asList(userArray);

    public User getUser(String userId) {
        return this.users.stream().filter(x -> x.getId().equals(userId)).findAny().orElse(null);
    }

    public User[] getUserArray() {
        return this.userArray;
    }

    public void setUserArray(User[] userArray) {
        this.userArray = userArray;
    }

    public List<User> getUsers() {
        return this.users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
