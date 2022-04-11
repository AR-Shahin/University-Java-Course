package shahin.ar;

public class OneCalculate extends MCalculate{

    @Override
    public void calculation(int z){
        double m;

        m = Math.sqrt((7*z) + (6 * Math.pow(z,2)));

        System.out.println(m);
    }

}
