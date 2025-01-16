package Dev._5.Project.Dev2025.Services;

import Dev._5.Project.Dev2025.Entities.Order;
import Dev._5.Project.Dev2025.Entities.User;
import Dev._5.Project.Dev2025.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll (){
        return repository.findAll();
    }

    public Order findById (Long id){
        Optional<Order> order = repository.findById(id);
        return order.get();
    }
}
