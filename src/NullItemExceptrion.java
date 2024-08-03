public class NullItemExceptrion extends RuntimeException {
    public NullItemExceptrion() {
    }

    public NullItemExceptrion(String message) {
        super(message);
    }

    public NullItemExceptrion(String message, Throwable cause) {
        super(message, cause);
    }

    public NullItemExceptrion(Throwable cause) {
        super(cause);
    }

    public NullItemExceptrion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
