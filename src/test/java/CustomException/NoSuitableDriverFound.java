package CustomException;

public class NoSuitableDriverFound extends Throwable {
    public static void Excepts() {
        try {
            throw new NullPointerException("error thrown. Please make amendments");
        } catch (NullPointerException e) {
            System.out.println("Caught inside Excepts().");
            throw e; // rethrowing the exception
        }

    }
}
