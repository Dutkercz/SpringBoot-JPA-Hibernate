package Dev._5.Project.Dev2025.Services;

import Dev._5.Project.Dev2025.Entities.User;
import Dev._5.Project.Dev2025.Repositories.UserRepository;
import Dev._5.Project.Dev2025.Services.Exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll (){
        return repository.findAll();
    }
    public User findById (Long id){
        Optional<User> user = repository.findById(id);
        return user.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert (User o){
        return repository.save(o);
    }

    public void delete(Long id){
        try{
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        }

    }

    public User update(Long id, User o){
        User entity = repository.getReferenceById(id);
        updateData(entity, o);
        return repository.save(entity);
    }

    private void updateData(User entity, User o) {
        entity.setName(o.getName());
        entity.setEmail(o.getEmail());
        entity.setPhone(o.getPhone());
    }
}
