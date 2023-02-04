package class17.hm;

public class Student {

    //5) Write a Student class   that have instance variables name and address.
    // Create a constructor that will initialize those variables.
    // Print name & address of given  student using displayInfo method.

    String name;
    String address;

    Student (String studentName, String studentAddress){
        name=studentName;
        address=studentAddress;
    }

    void displayInfo () {
        System.out.println(name+" "+address);
    }

    public static void main(String[] args) {
        Student student1= new Student("Jamie","1501 65th Street");
        student1.displayInfo();
    }

}
