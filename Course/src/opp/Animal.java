package opp;

public class Animal {
    public String name;
    public int age = 10;

    public static int size = 5;

    public Animal(String name){
//        this.print("I am calling from constructor!");
        this.name = name;
    }

    public void display(){
        this.print("Name : " + this.name);
        this.print("Age : " + this.age);

    }

    public void print(Object obj){
        System.out.println(obj);
    }

    public static void test(){
        System.out.println("Test");
    }

}
