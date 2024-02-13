import java.util.List;

public class AccountCreationException extends Exception {
    private List<String> exceptionMessages;

    public AccountCreationException(List<String> exceptionMessages) {
        this.exceptionMessages = exceptionMessages;
    }

    public List<String> getExceptionMessages() {
        return exceptionMessages;
    }

    @Override
    public String toString() {
        return "AccountCreationException{" +
                "exceptions=" + exceptionMessages +
                '}';
    }
}