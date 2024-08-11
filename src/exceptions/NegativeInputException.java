package exceptions;

public class NegativeInputException extends Exception {

    public NegativeInputException() {
        this("input must be greater than or eqaul to 0");
    }

    public NegativeInputException(String message) {
        super(message);
    }
}
