import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class PersonTableModel extends AbstractTableModel {
    ArrayList<Person> persons;

    public PersonTableModel(ArrayList<Person> persons){
        this.persons = persons;
    }

    @Override
    public int getRowCount() {
        return persons.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return persons.get(rowIndex).getFirstName();
            case 1:
                return persons.get(rowIndex).getLastName();
            case 2:
                return persons.get(rowIndex).getContactNo();
            case 3:
                return persons.get(rowIndex).getEmailAddress();
            default:
                return null;
        }

    }

    @Override
    public String getColumnName(int column) {
        switch( column ){
            case 0:
                return "FIRST NAME";
            case 1:
                return "LAST NAME";
            case 2:
                return "CONTACT NO.";
            case 3:
                return "EMAIL ADDRESS";
            default:
                return null;
        }
    }
}
