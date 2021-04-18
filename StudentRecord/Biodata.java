package StudentRecord;

public class Biodata {
    private String no_id;
    private String name;
    private Address home_Address;

    Biodata() {
        this.no_id = "";
        this.name = "";
        this.home_Address =null;
    }

    //using setter funtions to set values of all data members
    //using getter funtions to return all the data members

    public String getNo_id() {
        return no_id;
    }

    public void setNo_id(String no_id) {
        this.no_id = no_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getHome_Address() {
        return home_Address;
    }

    public void setHome_Address(Address home_Address) {
        this.home_Address = home_Address;
    }
}
