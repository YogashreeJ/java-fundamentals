package ExceptionHandling;

    // throws is used to declare an exception and pass (duck) it to the calling method
    // It is used to avoid try-catch block in every method
    // It is used with method signature
    // It can declare checked exceptions only
    // Checked exceptions are the exceptions that are checked at compile-time
    // Example of checked exceptions are IOException, SQLException etc.
    // Example of unchecked exceptions are ArithmeticException, NullPointerException etc.
    // Unchecked exceptions are not checked at compile-time
public class Throws {

    public void show() throws Exception {
        int i = 0;
        int j = 0;
        j = j / i;   // ArithmeticException occurs here
        System.out.println(j);
    }

    public static void main(String[] args) {

        Throws obj = new Throws();   // non-static method called using object

        try {
            obj.show();   // exception is ducked to main
        }
        catch (Exception e) {
            System.out.println("Sorry for the inconvenience");
            e.printStackTrace(); // it prints the entire of stack of method calls
        }
    }
}
