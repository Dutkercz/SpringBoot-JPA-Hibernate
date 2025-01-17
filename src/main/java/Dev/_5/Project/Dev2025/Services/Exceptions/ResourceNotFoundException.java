package Dev._5.Project.Dev2025.Services.Exceptions;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = -3597311276982449906L;

    public ResourceNotFoundException(Object id) {
        super("Resource not found. id " + id);
    }
}
