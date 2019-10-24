package ru.itvitality.sbrf.cu.l04.io.exception;

public class ExampleException extends RuntimeException {
    private final String errorMessage;

    public ExampleException( String errorMessage ) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
