import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class GSLRAgent extends Agent {


    protected void setup() {
        // Create and show the GUI
        InputDialogBox myGui = new InputDialogBox(this);
        myGui.showGui();
        System.out.println("Hello world! I'm a OneShot Gradient Linear Regression agent!");
        System.out.println("My local name is " + getAID().getLocalName());

    }

    public void getX(final String x) {
        addBehaviour(new OneShotBehaviour() {
            public void action() {
                SimpleDataSet data = new SimpleDataSet();
                GradientLinearRegression GSLR = new GradientLinearRegression(data.getX(), data.getY());
                System.out.println("Regression model equation: Y = "+GSLR.getB0()+" + "+GSLR.getB1()+"X");
                System.out.print("Proyected Value of Y:");
                System.out.print(GSLR.getB0()+GSLR.getB1()*Double.parseDouble(x) + "\n");
                myAgent.doDelete();
            }
        });

    }
}
