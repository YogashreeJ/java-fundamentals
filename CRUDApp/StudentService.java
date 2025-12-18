package CRUDApp;
import java.util.*;

    // StudentService class acts as a Service class.
public class StudentService {

    // Database
    ArrayList<Student> student=new ArrayList<>();

    //CRUD Operations

    //Create
    void addStudent(Student s){
        student.add(s); // add the data to the db
        System.out.println("Data added successfully!");
    }

    //Read
    void viewStudent(){
        if(student.isEmpty()) { // check if db is empty
            System.out.println("No data available");
            return;
        }
        for(Student s:student){
            System.out.println(
                "ID: " + s.id + 
                ", Name: " + s.name + 
                ", Age: " + s.age
            );
        }
    }

    // Update
    void updateStudent(int id,String newname,int newage){
        for(Student s: student){
            if(s.id==id){
                s.name=newname;
                s.age=newage;
                System.out.println("Student updated!");
                return;
            }
        }
        System.out.println("Student not found");
    }

    // Delete
    void deleteStudent(int id){
        Iterator<Student> it=student.iterator(); // creating an iterator tool to iterate through the student list

        while(it.hasNext()) // makes sure Is there another element in the list?
        {
            if (it.next().id == id) { // prevent ConcurrentModificationException
                it.remove();
                System.out.println("Student deleted!");
                return;
            }
        }
        System.out.println("Student not found");

    }

    
}
