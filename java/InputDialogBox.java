import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class InputDialogBox extends JFrame {
	private PredictiveAgent myAgent;

	private JTextField value;

	InputDialogBox(PredictiveAgent agent) {
		super(agent.getLocalName());
		
		myAgent = agent;
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2, 2));
		p.add(new JLabel("Value of X"));
		value = new JTextField();
		p.add(value);

		getContentPane().add(p, BorderLayout.CENTER);
		
		JButton addButton = new JButton("Calculate");
		addButton.addActionListener( new ActionListener() {

		public void actionPerformed(ActionEvent ev) {
	        
		      try {
		             myAgent.toPredict(value.getText().trim());
	              }
	              catch (Exception e) {
	                  JOptionPane.showMessageDialog(InputDialogBox.this, "Invalid value. "
				    +e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		      }
		  }
		});
		p = new JPanel();
		p.add(addButton);
		getContentPane().add(p, BorderLayout.SOUTH);
		
		// Make the agent terminate when the user closes 
		// the GUI using the button on the upper right corner	
		addWindowListener(new	WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				myAgent.doDelete();
			}
		} );
		
		setResizable(false);
	}
	
	public void showGui() {
		pack();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int centerX = (int)screenSize.getWidth() / 2;
		int centerY = (int)screenSize.getHeight() / 2;
		setLocation(centerX - getWidth() / 2, centerY - getHeight() / 2);
		super.setVisible(true);
	}	
}
