import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Triangle extends JPanel implements ActionListener{
	static Container container;
	static JLabel triangleTitle = new JLabel("Regular Triangle:");
	static JLabel triangleSide = new JLabel("Side:");
	static JLabel triangleArea = new JLabel("The area is:");
	static JLabel trianglePerimeter = new JLabel("The perimeter is:");
	static JTextField tR = new JTextField(10);
	static JTextField tA = new JTextField(10);
	static JTextField tP = new JTextField(10);
	static JButton tB = new JButton("計算");
	static JButton tC = new JButton("清除");
	
	public Triangle(){
		
		setLayout(null);
		triangleTitle.setBounds(30,275,100,15);
		triangleSide.setBounds(70,300,50,15);
		triangleArea.setBounds(70,325,70,15);
		trianglePerimeter.setBounds(70,350,100,15);
		
		tR.setBounds(200,295,100,20);
		tA.setBounds(200,325,100,20);
		tP.setBounds(200,355,100,20);
		
		tA.setEditable(false);
		tP.setEditable(false);
		
		tB.setBounds(310,295,80,20);
		tC.setBounds(400,295,80,20);
		
		tB.addActionListener(this);
		tC.addActionListener(this);
		
		add(triangleTitle);
		add(triangleSide);
		add(triangleArea);
		add(trianglePerimeter);
		add(tR);
		add(tA);
		add(tP);
		add(tB);
		add(tC);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==tB){
			try{
				int side = Integer.parseInt(tR.getText());
				double a = side*side*Math.pow(3,0.5)/4;
				double aa = (int)(Math.round(a*100.0))/100.0;
				double p = 3*side;
				String ssA = Double.toString(aa);
				String ssP = Double.toString(p);
				tA.setText(ssA);
				tP.setText(ssP);
			}
			catch(NumberFormatException q){
				JOptionPane.showMessageDialog(null,"格式錯誤!","提示",JOptionPane.WARNING_MESSAGE);
			}
		}
		if(e.getSource()==tC){
			tR.setText("");
			tA.setText("");
			tP.setText("");
		}
	}
}
