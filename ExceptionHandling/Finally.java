package ExceptionHandling;
    // finally block always executes irresepective of exception occur or not.
    // if we dont want to use catch block we can end the try block with finally
    // finally is usually used to close the resources , clean up.
    // finally executes even if return is used in try or catch
public class Finally {
    public static int test() {
    try {
        return 10;
    }
    finally {
        System.out.println("Finally runs");
    }
}

    
}
