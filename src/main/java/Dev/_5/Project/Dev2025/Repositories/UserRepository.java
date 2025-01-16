package Dev._5.Project.Dev2025.Repositories;

import Dev._5.Project.Dev2025.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
