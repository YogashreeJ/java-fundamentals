package Polymorphism;
class A{
    void show(){
        System.out.println("in A");
    }
}
class B extends A{
    @Override
    void show(){
        System.out.println("In B");
    }
}
class C extends B{
    @Override
    void show(){
        System.out.println("in C");
    }
}

public class MethodOverriding {
    public static void main(String[] args){
    A obj1=new A();//Dynamic Method Dispatch-object type is only seen and not the reference
    A obj2=new B();
    A obj3=new C();
    obj1.show();
    obj2.show();
    obj3.show();

}
}
