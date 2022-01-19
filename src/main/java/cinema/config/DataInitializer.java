package cinema.config;

import cinema.model.Role;
import cinema.model.User;
import cinema.service.RoleService;
import cinema.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final UserService userService;
    private final RoleService roleService;

    public DataInitializer(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    public void inject() {
        Role userRole = new Role();
        Role adminRole = new Role();
        userRole.setName(Role.RoleName.USER);
        adminRole.setName(Role.RoleName.ADMIN);
        roleService.add(userRole);
        roleService.add(adminRole);
        User user = new User();
        user.setEmail("user@gmail.com");
        user.setPassword("123");
        user.setRoles(Set.of(userRole, adminRole));
        userService.add(user);
    }
}
