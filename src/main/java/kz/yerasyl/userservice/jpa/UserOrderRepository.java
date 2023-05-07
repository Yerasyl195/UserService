package kz.yerasyl.userservice.jpa;

import kz.yerasyl.userservice.User;
import kz.yerasyl.userservice.UserOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserOrderRepository extends JpaRepository<UserOrder, Long> {
    UserOrder findTopByUserOrderByCreatedAtDesc(User user);
}
