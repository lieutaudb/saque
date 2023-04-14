package Exceptions;
public class businessException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public businessException(String msg) {
        super(msg);
    }
}