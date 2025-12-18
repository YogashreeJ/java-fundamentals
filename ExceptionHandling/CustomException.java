package ExceptionHandling;

// Custom Checked Exception
class TestCustomException extends Exception {
    // Constructor that accepts a message
    public TestCustomException(String message) {
        super(message); // Call the constructor of Exception class
    }
}

public class CustomException {

    public static void main(String[] args) {

        int i = 8;
        int j = 0;

        try {
            j = j / i;   // 0 / 8 = 0

            if (j == 0) { // Condition to throw custom exception
                throw new TestCustomException("It's my custom exception");
            }
        }
        catch (TestCustomException e) {
            j = 1;
            System.out.println(e.getMessage());
        }

        System.out.println(j);
    }
}
