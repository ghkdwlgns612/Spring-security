package shop.page.shoppingmall.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.page.shoppingmall.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
