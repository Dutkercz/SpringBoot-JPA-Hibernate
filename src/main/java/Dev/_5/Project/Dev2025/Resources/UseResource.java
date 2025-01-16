package Dev._5.Project.Dev2025.Resources;

import Dev._5.Project.Dev2025.Entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UseResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria", "@gmail.com", "999999", "abc123");
        return ResponseEntity.ok().body(u);
    }

}
