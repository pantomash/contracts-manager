package pl.contractsmanager.exception;

public class ValidationException extends RuntimeException {
    public ValidationException() {
        super("Błędne dane wejściowe");
    }
}
