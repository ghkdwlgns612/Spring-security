package shop.page.shoppingmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ShoppingMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingMallApplication.class, args);
    }

//    @Bean
//    CommandLineRunner run(UserService userService) {
//        return args -> {
//            userService.saveRole(new Role(null,"ROLE_USER"));
//            userService.saveRole(new Role(null,"ROLE_MANAGER"));
//            userService.saveRole(new Role(null,"ROLE_ADMIN"));
//            userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));
//
//            userService.saveUser(new User(null, "John traivs", "john", "1234", new ArrayList<>()));
//            userService.saveUser(new User(null, "Will Smitg", "will", "1234", new ArrayList<>()));
//            userService.saveUser(new User(null, "Jim Carry", "jim", "1234", new ArrayList<>()));
//            userService.saveUser(new User(null, "Arnorld Schwarzenegger", "arnold", "1234", new ArrayList<>()));
//
//            userService.addRoleToUser("john","ROLE_USER");
//            userService.addRoleToUser("john","ROLE_MANAGER");
//            userService.addRoleToUser("jim","ROLE_ADMIN");
//            userService.addRoleToUser("will","ROLE_MANAGER");
//            userService.addRoleToUser("arnold","ROLE_USER");
//            userService.addRoleToUser("arnold","ROLE_ADMIN");
//            userService.addRoleToUser("arnold","ROLE_SUPER_ADMIN");
//        };
//    }
}
