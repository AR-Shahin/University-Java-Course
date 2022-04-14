package ocp.violation;

public class AreaCalculator {

    private static BaseClass shapes [] = {new Circle(2),new Square(5),new Triangle(3,2)};
    public void calculator(){
        double sum = 0;
        for (BaseClass shape : shapes){
            if(shape instanceof Circle){
                sum += Math.PI * ((Circle) shape).radius * ((Circle) shape).radius;
            }
            if(shape instanceof Triangle){
                sum += 0.5 * ((Triangle) shape).base * ((Triangle) shape).height;
            }
        }

        System.out.println(sum);
    }
}

