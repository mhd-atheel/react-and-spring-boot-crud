package backend.backend.exception;

public class UserNotFoundException {
    public UserNotFoundException(Long id){
        super("Could Not Found the user with id " + id);
    }

}
