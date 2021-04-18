package PBLJassignment1;

class Employe implements Cloneable {
    private String name;

    public Employe(String name) {
        this.name = name;
    }

//	public Employee(Employee emp) {
//		this.name = emp.name;
//	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Employe clone() {
        try {
            return (Employe) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning Not Allowed");
            return this;
        }
    }
}

public class A5 {

    public static void main(String[] args) {
        Employe emp = new Employe("Bob Biswas");
        Employe empClone = emp.clone();

        empClone.setName("John Doe");

        System.out.println(empClone.getName());
        System.out.println(emp.getName());
    }

}