package Indication;

import java.io.IOException;
import java.io.Serializable;


public class Student implements Serializable
{

    //Student class fields
    int idNumber;
    String firstName;
    char middileInitial;
    String lastName;

    //default constructor
    Student()
    {

    }
    //primary conmtructor
    Student(int id,String fName,char Ini,String lName)
    {
        this.idNumber=id;
        this.firstName=fName;
        this.middileInitial=Ini;
        this.lastName=lName;
    }

    //getter and setter
    public int getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public char getMiddileInitial() {
        return middileInitial;
    }
    public void setMiddileInitial(char middileInitial) {
        this.middileInitial = middileInitial;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //display Method
    public void display()
    {
        System.out.println("First Name: "+this.firstName);
        System.out.println("Middle Initial : "+this.middileInitial);
        System.out.println("Last Name: "+this.lastName);
        System.out.println("Student Id: "+this.idNumber);
    }

    //main method
    public static void main(String[] args) throws IOException
    {
        IStudentSvclImpl obj=new IStudentSvclImpl();
        Student t=new Student(1,"jjj",'h',"lll");
        obj.writeToFIle(t);
        Student t1=obj.readFromFile();
        System.out.println("First Name: "+t1.firstName);
        System.out.println("Middle Initial : "+t1.middileInitial);
        System.out.println("Last Name: "+t1.lastName);
        System.out.println("Student Id: "+t1.idNumber);
    }

}