package exceptions;

public class YearConversionErrorException extends RuntimeException {
    private String errorMessage;

    public YearConversionErrorException(String errorMessage){
        this.errorMessage = errorMessage;
    }

    @Override
    public String getMessage() {
        return this.errorMessage;
    }
}
