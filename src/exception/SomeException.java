package exception;

public class SomeException extends Exception{

    public SomeException(String massage) {
        super(massage);
    }

    @Override
    public String getMessage() {
        return  "Wrong URL type: " + super.getMessage();
    }
}
