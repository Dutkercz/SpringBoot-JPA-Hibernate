package Dev._5.Project.Dev2025.Repositories;

import Dev._5.Project.Dev2025.Entities.Category;
import Dev._5.Project.Dev2025.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
