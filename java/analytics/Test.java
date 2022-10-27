public class Test {

    public static void main(String[] args) {

        SimpleDataSet data = new SimpleDataSet();
        GradientLinearRegression GSLR = new GradientLinearRegression(data.getX(), data.getY());
        System.out.println(GSLR.getB0());
        System.out.println(GSLR.getB1());
    }
    
}
