package kz.yerasyl.userservice;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User addUser(User user);
    User getUserById(Long id);
    User getUserByPhone(String phone);
    List<UserOrder> getUserHistory(Long userId);
    UserOrder getLastOrderForUser(Long userId);
    UserOrder addOrderToUserHistory(Long userId, UserOrder userOrder);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Long userId);
}
