package kz.yerasyl.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/byPhone")
    public User getUserByPhone(@RequestParam String phone) {
        return userService.getUserByPhone(phone);
    }

    @GetMapping("/{id}/history")
    public List<UserOrder> GetParkingHistoryForUser(@PathVariable Long id) {
        return userService.getUserHistory(id);
    }

    @GetMapping("/{id}/history/last")
    public UserOrder getLastOrderForUser(@PathVariable Long id) {
        return userService.getLastOrderForUser(id);
    }

    @PostMapping("/{id}/history")
    public UserOrder addOrderToUserHistory(@PathVariable Long id, @RequestBody UserOrder newOrder) {
        return userService.addOrderToUserHistory(id, newOrder);
    }
}


