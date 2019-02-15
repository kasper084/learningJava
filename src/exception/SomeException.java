package exception;

public class SomeException extends Exception{

    public SomeException(String massage) {
        super(massage);
    }

    @Override
    public String getMessage() {
        return  "Wow\t" + super.getMessage();
    }
}
