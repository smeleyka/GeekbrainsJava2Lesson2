/**
 * Created by smeleyka on 27.04.17.
 */
public class MySizeArrayException extends Exception{
    public MySizeArrayException() {
        super("Неверный размер входящего массива (arr[4][4]).");
    }

    public MySizeArrayException(String message) {
        super(message);
    }

    public MySizeArrayException(String message, Throwable cause) {
        super(message, cause);
    }

    public MySizeArrayException(Throwable cause) {
        super(cause);
    }

    public MySizeArrayException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

