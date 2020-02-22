import java.io.IOException;

public class NameUndefinedException extends IOException {
    public NameUndefinedException(String message) {
        super(message);
    }
}
