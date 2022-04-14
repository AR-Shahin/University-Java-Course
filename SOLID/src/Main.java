import ocp.right.Circle;
import ocp.right.ShapeInterface;
import ocp.right.Triangle;
import ocp.violation.AreaCalculator;
import srp.right.Mail;
import srp.violation.User;


public class Main {
    public static void main(String args[]){
//        User shahin = new User("Shahin","s@mail.com");
//        shahin.userInfo();
//        shahin.sendMail();
//        srp.right.User omi = new srp.right.User("Omi","omi@mail.com");
//        Mail.send(omi.getEmail());

        AreaCalculator ar = new AreaCalculator();
        ocp.right.AreaCalculator arc = new ocp.right.AreaCalculator();
        ar.calculator();

        ShapeInterface shapes[] = {new Circle(2),new Triangle(3,2)};
        arc.calculator(shapes);
    }
}
