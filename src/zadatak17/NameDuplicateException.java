package zadatak17;

/**
 * Created by osman on 6/19/17.
 */
public class NameDuplicateException extends Exception {
    public NameDuplicateException() {
    }

    public NameDuplicateException(String message) {
        super(message);
    }

    public NameDuplicateException(String message, Throwable cause) {
        super(message, cause);
    }

    public NameDuplicateException(Throwable cause) {
        super(cause);
    }

    public NameDuplicateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
