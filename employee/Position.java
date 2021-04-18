package employee;

public class Position extends Employee{
    int employeeId;
    String dept;
    int workHrs;
    int incentives;

    //default constructors
    Position(){
        this.employeeId = 0;
        this.dept = "None";
        this.workHrs = 0;
        this.incentives= 0;
    }

    //getting the input and storing it in variables
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getWorkHrs() {
        return workHrs;
    }

    public void setWorkHrs(int workHrs) {
        this.workHrs = workHrs;
    }


    //calculating the incentive
    void calIncentive(){
        if(workHrs>=90){
            this.incentives = 300;
        }
        else if(workHrs>75 && workHrs <89){
            this.incentives = 200;
        }
        else if(workHrs>50 && workHrs <75){
            this.incentives = 100;
        }
    }

    //showing the output
    void printData(){
        System.out.println("Name: "+name+"\nAge: "+age+"\nGender: "+gender+"\nAddress: "+ address);
        System.out.println("Employee Id: "+employeeId+"\nDepartment: "+dept+
                "\nWorking Hours: "+workHrs+"\nIncentive: "+incentives);
    }


}
