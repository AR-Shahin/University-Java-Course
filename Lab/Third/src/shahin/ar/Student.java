package shahin.ar;

public class Student extends Person{
    private int id;
    private double cgpa;
    private String email;
    private String department;
    private int batch;

    public Student(String name, String gender, int age, String cellNo, String address, int id, String email, String department, int batch,double cgpa) {
        super(name, gender, age, cellNo, address);
        this.id = id;
        this.email = email;
        this.department = department;
        this.batch = batch;
        this.cgpa = cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }

    public int getBatch() {
        return batch;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    protected boolean hasNationality(){
        return this.getNationality() != "" ? true : false;
    }
}
