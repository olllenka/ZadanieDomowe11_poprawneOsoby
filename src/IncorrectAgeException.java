import java.io.IOException;

public class IncorrectAgeException extends IOException {
    public IncorrectAgeException(String message) {
        super(message);
    }
}
