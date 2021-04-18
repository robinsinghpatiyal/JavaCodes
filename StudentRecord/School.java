package StudentRecord;

public class School {
    //data members private based on uml
    private String name;
    private Address address;

    //default constructor initialization
    School(){
        this.name = "";
        this.address = null;
    }

    //using getter funtions to return all the data members
    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
