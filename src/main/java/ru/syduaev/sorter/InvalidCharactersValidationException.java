package ru.syduaev.sorter;

public class InvalidCharactersValidationException extends RuntimeException {

    private String invalidString;
    private String position;

    public InvalidCharactersValidationException(String message, String invalidString, int position) {
        super(message);
        this.invalidString = invalidString;
        this.position = String.valueOf(position);
    }

    public String getInvalidString() {
        return invalidString;
    }

    public String getPosition() {
        return position;
    }
}
