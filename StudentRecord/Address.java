package StudentRecord;

public class Address {
    private int number;
    private String road;
    private int postcode;
    private String state;
    private int no_tel;

    Address(int number, String road, int postcode, String state, int no_tel){
        this.number = number;
        this.road = road;
        this.postcode = postcode;
        this.state = state;
        this.no_tel = no_tel;
    }

    //using getter funtions to return all the data members
    public int getNumber() {
        return number;
    }

    public String getRoad() {
        return road;
    }

    public int getPostcode() {
        return postcode;
    }

    public String getState() {
        return state;
    }

    public int getNo_tel() {
        return no_tel;
    }
}
