import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NavBar  extends JPanel{

	JButton delete;
	JButton edit;
	public NavBar() {
	this.setBackground(Color.GRAY);
	this.setPreferredSize(new Dimension(200, 70));
	this.setLayout(null);
	
	JLabel label = new JLabel("Student Management System");
	label.setBounds(20, 20, 200, 25);
	
	 delete = new JButton("Delete");

	delete.setBounds(800, 20, 80, 40);
	delete.setFocusable(false);
	
	 edit = new JButton("Edit");

	edit.setBounds(700, 20, 80, 40);
	edit.setFocusable(false);
	
	this.add(label);
	this.add(edit);
	this.add(delete);
	
	}

    // Getter method for delete button
    public JButton getDeleteButton() {
        return delete;
    }

    // Getter method for edit button
    public JButton getEditButton() {
        return edit;
    }


}
