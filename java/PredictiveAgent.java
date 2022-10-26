import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class PredictiveAgent extends Agent {


    protected void setup() {
        // Create and show the GUI
        InputDialogBox myGui = new InputDialogBox(this);
        myGui.showGui();
        System.out.println("Hello world! I'm a OneShot Gradient Linear Regression agent!");
        System.out.println("My local name is " + getAID().getLocalName());

    }

    public void toPredict(final String x) {
        addBehaviour(new OneShotBehaviour() {
            public void action() {
                DataSet data = new DataSet();
                GradientDescent gd = 
			new GradientDescent(data.getX(), data.getY());
                System.out.println("Regression model equation: Y = "+
				     gd.getB0()+" + "+gd.getB1()+"X");
                System.out.print("Proyected Value of Y:");
                System.out.print(gd.getB0()+gd.getB1()*Double.parseDouble(x) + "\n");
                myAgent.doDelete();
            }
        });

    }
}
