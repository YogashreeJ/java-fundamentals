package CRUDApp;
    // This acts as an entity class.
    //Entity in this project is Studen.
class Student {

    // Instance variables - stored in heap memory
    int id;
    String name;
    int age;

    // Constructor
    Student(int id, String name, int age) {

        // Local variable -stored in stack memory
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

