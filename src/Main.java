import java.awt.BorderLayout;

import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		Frame frame = new Frame();
		
		studentModel studentmodel = new studentModel();
		
		NavBar nav = new NavBar();
		Table table = new Table(studentmodel, nav);
		Contents content = new Contents(studentmodel, table);
		
		frame.add(nav, BorderLayout.NORTH);
		frame.getContentPane().add(content, BorderLayout.WEST);
		frame.add(table, BorderLayout.CENTER);
		frame.setVisible(true);
	}

}
