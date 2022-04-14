package srp.violation;

public class User {
    private String name;
    private String email;

    public User(String name,String email){
        this.name = name;
        this.email = email;
    }

    public void userInfo(){
        System.out.println(this.name + " " + this.email);
    }

    public void sendMail(){
        System.out.println("Mail has been sent to " + this.email);
    }
}
