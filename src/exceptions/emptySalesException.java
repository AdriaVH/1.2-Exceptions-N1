package exceptions;

public class emptySalesException extends Exception{

    public emptySalesException(String message) {
        super(message);
    }

    public emptySalesException() {
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
