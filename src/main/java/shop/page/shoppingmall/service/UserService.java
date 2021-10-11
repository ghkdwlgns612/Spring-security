package shop.page.shoppingmall.service;

import shop.page.shoppingmall.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
