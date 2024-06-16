package Lab1.demo.repository;

import org.springframework.data.repository.CrudRepository;
import Lab1.demo.model.UserRole;

public interface UserRolesRepository extends CrudRepository<UserRole, Long> {
}
