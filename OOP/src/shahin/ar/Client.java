package shahin.ar;

import helper.Helper;

public class Client extends Helper {
    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    @Override
    public void print(Object obj){
        System.out.print("Hi " + obj);
    }
    public void printName(){
        this.print(this.name);
    }
}
