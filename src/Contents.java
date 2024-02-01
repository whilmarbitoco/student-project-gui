import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Contents extends JPanel implements ActionListener{

	studentModel studentmodel;
	JButton submit;
	Table table;
	JTextField name;
	JTextField course;
	JTextField year;
	public Contents(studentModel studentmodel, Table table) {
		this.setBackground(Color.white);
		this.setPreferredSize(new Dimension(300, 70));
		this.setLayout(null);
		
		this.table = table;
		this.studentmodel = studentmodel;
		JLabel label = new JLabel("Enter Name");
		label.setBounds(30, 10, 100, 20);
		 name = new JTextField();
		name.setBounds(30, 28, 200, 30);
		
		JLabel label2 = new JLabel("Enter Course");
		label2.setBounds(30, 65, 100, 20);
		 course = new JTextField();
		course.setBounds(30, 83, 200, 30);
		
		JLabel label3 = new JLabel("Enter Year");
		label3.setBounds(30, 123, 100, 20);
		 year = new JTextField();
		year.setBounds(30, 142, 200, 30);
		
		 submit = new JButton("Submit");
		submit.setBounds(30, 180, 200, 30);
		submit.addActionListener(this);

				
		this.add(name);
		this.add(label);
		this.add(course);
		this.add(label2);
		this.add(label3);
		this.add(year);
		this.add(submit);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == submit) {
			if (!name.getText().isEmpty() && !course.getText().isEmpty() && !year.getText().isEmpty()) {
				studentmodel.add(name.getText(), course.getText(),year.getText());
//				table.addRow(studentmodel.getStudents());
				table.refreshTable();
			} else {
			   JOptionPane optionpane = new JOptionPane();
			   optionpane.showMessageDialog(null, "Form is invalid", "Invalid Form", JOptionPane.ERROR_MESSAGE);
			}

		}
		
	}



}
