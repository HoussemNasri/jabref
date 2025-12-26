package org.jabref.gui.preferences.autorestart;

public class RestartException extends RuntimeException {
    RestartException(String message) {
        super(message);
    }

    RestartException(String message, Throwable cause) {
        super(message, cause);
    }

    RestartException(Throwable cause) {
        super(cause);
    }
}
