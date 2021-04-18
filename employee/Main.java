package employee;

public class Main {
    public static void main(String[] args){

        //creating object of employee class
        Employee empobj = new Employee();

        //assigning the data to variables
        //You can also do it by taking input from the user using Scanner
        empobj.name ="Arun";
        empobj.age = 40;
        empobj.gender ='M';
        empobj.address="New York";

        //displaying data
        empobj.printInfo();

        //creating object of position class
        Position posobj = new Position();

        //assigning the data to variables
        //You can also do it by taking input from the user using Scanner
        posobj.name ="Robin";
        posobj.age = 30;
        posobj.gender ='M';
        posobj.address="California";
        posobj.employeeId = 1002;
        posobj.dept = "DS";
        posobj.workHrs= 90;

        //calculating incentive
        posobj.calIncentive();

        //displating info
        posobj.printData();
    }
}
