package srp.right;

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    private String email;

    public User(String name,String email){
        this.name = name;
        this.email = email;
    }

    public void userInfo(){
        System.out.println(this.name + " " + this.email);
    }

}
