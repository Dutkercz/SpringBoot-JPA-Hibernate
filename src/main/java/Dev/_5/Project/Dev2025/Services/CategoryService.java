package Dev._5.Project.Dev2025.Services;

import Dev._5.Project.Dev2025.Entities.Category;
import Dev._5.Project.Dev2025.Repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll (){
        return repository.findAll();
    }

    public Category findById (Long id){
        Optional<Category> Category = repository.findById(id);
        return Category.get();
    }
}
