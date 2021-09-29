package shop.page.shoppingmall.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.page.shoppingmall.domain.Role;
import shop.page.shoppingmall.domain.User;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
