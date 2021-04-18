package StudentRecord;

public class MyLab2Main {
    public static void main(String[] args){
        //biodata obj
        Biodata bioObj = new Biodata();

        //student obj
        Student stdObj = new Student();
        stdObj.setBiodata(bioObj);

        stdObj.setNo_id("A12345");
        bioObj.setNo_id(stdObj.getNo_id());

        //name
        bioObj.setName("Ahmad");

        //address object
        Address objAdd = new Address(789,"Jalan Munshi Abdullah",75400,"Melaka", 623232323);
        bioObj.setHome_Address(objAdd);

        //school address
        Address objAddS = new Address(5,"Jalan Tun Fatimah",75400,"Melaka",0);
        //school obj
        School objSch = new School();
        objSch.setAddress(objAddS);
        objSch.setName("Sekolah Tun Tijah");

        stdObj.setForm(5);
        //printing the details using all the objects
        System.out.println("Student\n"+"No id: "+ stdObj.getNo_id());
        System.out.println("Biodata: \n"+"No_id: "+stdObj.getBiodata().getNo_id()+"\nName: "+stdObj.getBiodata().getName());
        System.out.println("Address:\n"+objAdd.getNumber()+", "+objAdd.getRoad()+" \n"+objAdd.getPostcode()+" "+ objAdd.getState()+"\n"+objAdd.getNo_tel());
        System.out.println("Form: "+stdObj.getForm());
        System.out.println("School\n"+objSch.getName()+"\nSchool Address:\n"+stdObj.getForm()+
                ", "+ objSch.getAddress().getRoad()+", "+objSch.getAddress().getPostcode()+"\n"+objSch.getAddress().getState());

    }

}
