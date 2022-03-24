package shahin.ar;

public class Person {
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

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setCellNo(String cellNo) {
        this.cellNo = cellNo;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    protected String name;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    protected String gender;
    protected int age;
    protected float height;
    protected float weight;

    public String getCellNo() {
        return cellNo;
    }

    protected String cellNo;

    public String getCity() {
        return city;
    }

    protected String city;
    protected String birthPlace;
    protected String birthDate;
    protected String address;

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    protected String nationality;
    public Person(String name, String gender, int age, String cellNo, String city) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.cellNo = cellNo;
        this.city = city;
    }


}
