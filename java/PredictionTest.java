public class PredictionTest {

    public static void main(String[] args) {
        DataSet data = new DataSet();
        GradientDescent gd = 
		new GradientDescent(data.getX(), data.getY());
        System.out.println(gd.getB0());
        System.out.println(gd.getB1());
    }
    
}
