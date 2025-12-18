package ExceptionHandling;

public class TryCatch {
        // Try-catch block is used to handle exceptions in Java.

    public static void main(String[] args){
        int i=0;
        int j=0;
         
        //place the crtical statement inside try block
        try{
            j=j/i; // this will throw ArithmeticException
        }
        // catch blocks are executed in order.

        catch(ArithmeticException e){ // executed first
            System.out.println("Its and arithmetic exception");
        }
        catch(IndexOutOfBoundsException e){ // executes second
            System.out.println("Check your index range");
        }
        catch(Exception e){ // executes last
            System.out.println("I don't know");
        }
    }
    
}
