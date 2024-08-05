package dev.scorpio;

public class CustomException extends RuntimeException{
    public CustomException(String message)
    {
        super(message);
    }
    /*public static void main(String[] args) {
        int a=10;
        try {
            callCustomException();
        } catch (CustomException e) {
            throw new RuntimeException(e);
        }
    }*/
    public static void main(String[] args) {
        int a=10;
        callCustomException();
    }

    private static void callCustomException() throws CustomException {
        throw new CustomException("customer exception 1 called..");
    }
}
