import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Frame extends JFrame{

	public Frame() {
		this.setTitle("Student Management System");
		this.setSize(900, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);	
		this.setLayout(new BorderLayout());
		}

}
