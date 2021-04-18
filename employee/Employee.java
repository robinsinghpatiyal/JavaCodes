package employee;

public class Employee {
    String name;
    int age;
    char gender;
    String address;

    //Default constructor in case no value is assigned
    Employee(){
        this.name ="None";
        this.age = 0;
        this.gender =' ';
        this.address="None";
    }

    //this will get inputs

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //this will show the output
    void printInfo(){
        System.out.println("Name: "+name+"\nAge: "+age+"\nGender: "+gender+"\nAddress: "+ address+"\n\n");
    }

}
