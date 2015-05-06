import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Circle extends JPanel implements ActionListener{
	JLabel circleTitle = new JLabel("Circle:");
	JLabel circleRadius = new JLabel("Radius:");
	JLabel circleArea = new JLabel("The area is:");
	JLabel circlePerimeter = new JLabel("The perimeter is:");
	JTextField cR = new JTextField(10);
	JTextField cA = new JTextField(10);
	JTextField cP = new JTextField(10);
	JButton cB = new JButton("計算");
	JButton cC = new JButton("清除");
	
	public Circle(){
		
		setLayout(null);
		circleTitle.setBounds(30,25,50,15);
		circleRadius.setBounds(70,50,50,15);
		circleArea.setBounds(70,80,70,15);
		circlePerimeter.setBounds(70,110,100,15);
		
		cR.setBounds(200,45,100,20);
		cA.setBounds(200,75,100,20);
		cP.setBounds(200,105,100,20);
		
		cA.setEditable(false);
		cP.setEditable(false);
		
		cB.setBounds(310,45,80,20);
		cC.setBounds(400,45,80,20);
		
		cB.addActionListener(this);
		cC.addActionListener(this);
		
		add(circleTitle);
		add(circleRadius);
		add(circleArea);
		add(circlePerimeter);
		add(cR);
		add(cA);
		add(cP);
		add(cB);
		add(cC);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==cB){
			try{
				int r = Integer.parseInt(cR.getText());
				double a = r*r*3.14;
				double aa = (int)(Math.round(a*100.0))/100.0;
				double p = 2*r*3.14;
				String ssA = Double.toString(aa);
				String ssP = Double.toString(p);
				cA.setText(ssA);
				cP.setText(ssP);
			}
			catch(NumberFormatException q){
				JOptionPane.showMessageDialog(null,"格式錯誤!","提示",JOptionPane.WARNING_MESSAGE);
			}
		}
		if(e.getSource()==cC){
			cR.setText("");
			cA.setText("");
			cP.setText("");
		}
	
	}
}
