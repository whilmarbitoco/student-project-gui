import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Table extends JPanel implements ActionListener{

    private studentModel studentmodel;
    private DefaultTableModel tablemodel;
    private JTable table;

    public Table(studentModel studentmodel, NavBar nav) {
        this.setPreferredSize(new Dimension(300, 100));
        this.setLayout(new BorderLayout());
        
        this.studentmodel = studentmodel;
        
        String col[] = {"Name", "Course", "Year"};
        
        tablemodel = new DefaultTableModel(col, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
               //all cells false
               return false;
            }
        };
        table = new JTable(tablemodel);
        
        JScrollPane tableContainer = new JScrollPane(table);
        
        
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (!e.getValueIsAdjusting()) {
				if (table.getSelectedRow() != -1) {
					nav.getEditButton().addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							System.out.println("edit");
							
						}
					});
					
		nav.getDeleteButton().addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							System.out.println("delete");
							
						}
					});
		
				}
				}
				
			}
		});
        
        this.add(tableContainer, BorderLayout.CENTER);
    }

    public void refreshTable() {
        ArrayList<Student> students = studentmodel.getStudents();
        
        tablemodel.setRowCount(0); 

        
        for (int i = 0; i < students.size(); i++) {
            Object[] obj = {students.get(i).name, students.get(i).course, students.get(i).year};
            tablemodel.addRow(obj); 

        }
        
        tablemodel.fireTableDataChanged(); 

    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e);
		
	}
}
