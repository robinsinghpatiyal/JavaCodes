package StudentRecord;

public class Student {
    private String no_id;
    private Biodata biodata;
    private int form;
    private School school;

    Student(){
        this.no_id = "";
        this.biodata = null;
        this.form = 0;
        this.school = null;
    }

    public String getNo_id() {
        return no_id;
    }

    public void setNo_id(String no_id) {
        this.no_id = no_id;
    }

    public Biodata getBiodata() {
        return biodata;
    }

    public void setBiodata(Biodata biodata) {
        this.biodata = biodata;
    }

    public int getForm() {
        return form;
    }

    public void setForm(int form) {
        this.form = form;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
