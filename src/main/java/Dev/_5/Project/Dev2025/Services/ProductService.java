package Dev._5.Project.Dev2025.Services;

import Dev._5.Project.Dev2025.Entities.Product;
import Dev._5.Project.Dev2025.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll (){
        return repository.findAll();
    }

    public Product findById (Long id){
        Optional<Product> product = repository.findById(id);
        return product.get();
    }
}
