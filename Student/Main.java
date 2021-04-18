package Student;

import java.util.Scanner;
//Main class used to run the whole program
//also called as driver class
public class Main {
    public static void  main(String[] args){
        Scanner s = new Scanner(System.in);
        //taking the number of students as input
        System.out.println("Enter the number of students : ");
        int n = s.nextInt();

        //creating an array of objects of class Student which will store the data of all students
        //including the total marks
        Student obj[] = new Student[n];

        for(int i = 0; i<n; i++){
            String name = s.next();
            int CSE115 = s.nextInt();
            int CSE172 = s.nextInt();
            int CSE215 = s.nextInt();
            int CSE311 = s.nextInt();
            int CSE331 = s.nextInt();
            obj[i] = new Student(name,CSE115,CSE172,CSE215,CSE311,CSE331); //passing all the values except total marks

        }
        //creating the object of Totalmark class
        Totalmark ob = new Totalmark();

        //calculating the total marks of all the studnets and storing it in Stundent class
        for(int i = 0; i<n;i++) {
            int total = 0;
            total = ob.myTotalMark(obj[i].CSE115,obj[i].CSE172,obj[i].CSE215,obj[i].CSE311,obj[i].CSE331);
            obj[i].total = total; //passing the total marks of students one by one to their respective objects
        }

        //creating an object of specificStudent which will store and display the total marks of specific students only
        specificStudent objc = new specificStudent();

        int arr[] = new int[3]; //this array will store the index number of the object which the teacher entered name for
        int index = 0;
        int count = 0;

        // this for loop is used to traverse through the objects of student class and search for specific students
        // it will also take the input of the student name the teacher wants
        for(int i =0;i<3;i++) {
            count = i+1;
            System.out.println("\nEnter the name of the student :"+count); //count variable is for the display purpose only. You can igonre it if you want to

            String studName = s.next(); //taking input
            int j =0;
            //search for the indexes of students name matching objects and also calling the function inside specificStudent class to store total marks
            while(j<n){
                if(obj[j].name.equals(studName)){
                    arr[index] = j;
                    index++;
                    objc.store(obj[j].total);
                    break;
                }
                j++;
            }
        }


        //displaying the names of specific students only using the indexes stored inside arr array!
        for(int i =0;i<3;i++){
            objc.display(obj[arr[i]].name,obj[arr[i]].CSE115,obj[arr[i]].CSE172,obj[arr[i]].CSE215,obj[arr[i]].CSE311,obj[arr[i]].CSE331);
        }

    }
}
/*
7
Jamal 80 70 60 87 94
Mumunul 82 73 62 81 90
Saad 10 20 30 87 54
Rana 20 70 100 97 74
Ashraful 60 70 50 47 64
Arifur 80 76 65 47 14
Ibrahim 84 77 607 67 34
Saad
Jamal
Arifur
 */