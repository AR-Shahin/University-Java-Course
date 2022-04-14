package ocp.right;

public class AreaCalculator {
    public void calculator(ShapeInterface shapes[]){
        double sum = 0;

        for (ShapeInterface shape : shapes){
            sum += shape.area();
        }

        System.out.println(sum);
    }
}
