package Inheritence;
    // Inheritence is a mechanism where a new class acquires the properties (methods and fields) of an existing class.
    // Single Inheritence is a type of inheritence where a class inherits from one parent
    class Animal {

    // Method of parent class
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class (Derived class)
// Dog inherits Animal → single inheritance
class Dog extends Animal {

    // Method of child class
    void bark() {
        System.out.println("Dog is barking");
    }
}


    public class SingleInheritence {
     public static void main(String[] args) {

        // Creating object of child class
        Dog d = new Dog();

        // Calling parent class method
        d.eat();     // inherited from Animal

        // Calling child class method
        d.bark();    // defined in Dog
    }
    
}
