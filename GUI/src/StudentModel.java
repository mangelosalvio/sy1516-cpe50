import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;


public class StudentModel extends AbstractTableModel {

	private ArrayList<Student> students;
	
	public ArrayList<Student> getStudents() {
		return students;
	}
	
	
	public StudentModel() {
		// TODO Auto-generated constructor stub
		students = new ArrayList<Student>();
	}
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return students.size();
	}

	@Override
	public Object getValueAt(int r, int c) {
		// TODO Auto-generated method stub
		switch (c) {
		case 0:
			return students.get(r).getFirstName();		
		case 1:
			return students.get(r).getLastName();
		case 2:
			return students.get(r).getAddress();

		default:
			break;
		}
		return null;
	}
	
	@Override
	public String getColumnName(int c) {
		// TODO Auto-generated method stub
		switch (c) {
		case 0:
			return "First Name";		
		case 1:
			return "Last Name";
		case 2:
			return "Address";

		default:
			break;
		}
		return null;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return true;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		switch (columnIndex) {
			case 0:
				students.get(rowIndex).setFirstName((String)aValue);
				break;
			case 1:
				students.get(rowIndex).setLastName((String)aValue);
				break;
			case 2:
				students.get(rowIndex).setAddress((String)aValue);
				break;
			default:
				break;
		}
	}
}
