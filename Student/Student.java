package Student;
//this class is used to store the data of students
public class Student {
    String name;
    int CSE115;
    int CSE172;
    int CSE215;
    int CSE311;
    int CSE331;
    int total;

    //Parameterized constructor of class which will pass the values to the variables of the class
    public Student(String name, int CSE115, int CSE172, int CSE215, int CSE311, int CSE331){
        this.name = name;
        this.CSE115 = CSE115;
        this.CSE215 = CSE215;
        this.CSE172 = CSE172;
        this.CSE311 = CSE311;
        this.CSE331 = CSE331;
    }
}
