package shahin.ar;



public class Teacher extends Person{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private String rank;
    private String email;
    private String joiningDate;
    private String department;
    private double salary;

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public Teacher(String name, String gender, int age, String cellNo, String address, int id, String rank, String email, String joiningDate, String department, double salary) {
        super(name, gender, age, cellNo, address);
        this.id = id;
        this.rank = rank;
        this.email = email;
        this.joiningDate = joiningDate;
        this.department = department;
        this.salary = salary;
    }


}
