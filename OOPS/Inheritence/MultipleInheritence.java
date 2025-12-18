package Inheritence;
    // Multiple Inheritence is a type of inheritence where a class can inherit properties from more than one parent class.
    // Parent class
class Vehicle{
    String purpose(){
        return "Transpotation";
    }
}
    // Child class 1
class Car extends Vehicle{
    int wheels(){
        return 4;
    }
}
        // Child class 2
class Suzuki extends Car{
    int price(){
        return 40;
    }
}

public class MultipleInheritence {
    public static void main(String[] args){
    Suzuki s=new Suzuki();
    String purpose=s.purpose();
    int wheel=s.wheels();
    int price=s.price();
    System.out.print("The purpose of vehicle is"+purpose+"and it has"+wheel+"wheels.It costs"+price+"Rs" );

    }
    
}

