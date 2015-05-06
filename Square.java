import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Square extends JPanel implements ActionListener{
	static Container container;
	static JLabel squareTitle = new JLabel("Square:");
	static JLabel squareSide = new JLabel("Side:");
	static JLabel squareArea = new JLabel("The area is:");
	static JLabel squarePerimeter = new JLabel("The perimeter is:");
	static JTextField sR = new JTextField(10);
	static JTextField sA = new JTextField(10);
	static JTextField sP = new JTextField(10);
	static JButton sB = new JButton("計算");
	static JButton sC = new JButton("清除");
	
	public Square(){
		
		setLayout(null);
		squareTitle.setBounds(30,150,50,15);
		squareSide.setBounds(70,175,50,15);
		squareArea.setBounds(70,205,70,15);
		squarePerimeter.setBounds(70,235,100,15);
		
		sR.setBounds(200,170,100,20);
		sA.setBounds(200,200,100,20);
		sP.setBounds(200,230,100,20);
		
		sA.setEditable(false);
		sP.setEditable(false);
		
		sB.setBounds(310,170,80,20);
		sC.setBounds(400,170,80,20);
		
		sB.addActionListener(this);
		sC.addActionListener(this);
		
		add(squareTitle);
		add(squareSide);
		add(squareArea);
		add(squarePerimeter);
		add(sR);
		add(sA);
		add(sP);
		add(sB);
		add(sC);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==sB){
			try{
				int side = Integer.parseInt(sR.getText());
				double a = side*side;
				double p = 4*side;
				String ssA = Double.toString(a);
				String ssP = Double.toString(p);
				sA.setText(ssA);
				sP.setText(ssP);
			}
			catch(NumberFormatException q){
				JOptionPane.showMessageDialog(null,"格式錯誤!","提示",JOptionPane.WARNING_MESSAGE);
			}
		}
		if(e.getSource()==sC){
			sR.setText("");
			sA.setText("");
			sP.setText("");
		}
	
	}
}
