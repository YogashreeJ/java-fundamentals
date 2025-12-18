package ExceptionHandling;
    // throw keyword is used to generate an exceotion or to call the catch block even when exceptions dont occur
public class Throw {

public static void main(String[] args){

    int i=8;
    int j=0;

    try{
        j=j/i;
        if(j==0){ // generates an exception if j=0
            throw new ArithmeticException(); // throws an exception
        }
    }

    catch(Exception e){
        j=1; // handles the exception
        System.out.println("This is default value");
    }
    System.out.println(j);
}
    
}
