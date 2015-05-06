import javax.swing.JFrame;

public class GeoCalculate extends JFrame{
	Circle ccc = new Circle();
	Square sss = new Square();
	Triangle ttt = new Triangle();
	public GeoCalculate(){
		
		ccc.setSize(550,150);
		sss.setSize(550,250);
		ttt.setSize(550,150);
		add(ccc);
		add(sss);
		add(ttt);
		
	}
	public static void main(String[] args){
		GeoCalculate frame = new GeoCalculate();
		frame.setTitle("u10316048_GeoCalculate");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(550,450);
		frame.setVisible(true);
		frame.setResizable(false);
	}
}
