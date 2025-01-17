package Dev._5.Project.Dev2025.Repositories;

import Dev._5.Project.Dev2025.Entities.OrderItem;
import Dev._5.Project.Dev2025.Entities.PK.OrderItemPK;
import Dev._5.Project.Dev2025.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface    OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
