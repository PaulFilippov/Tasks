package labsKorolev.Lab3SwingAndJDBC.TableModels;

import labsKorolev.Lab3SwingAndJDBC.Entities.Sotr;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class SotrTableModel extends AbstractTableModel {

    private static final int ID_COL = 0;
    private static final int IDVUS_COL = 1;
    private static final int NAME_COL = 2;
    private static final int PHONE_COL = 3;

    private String[] columnNames = {"ID", "IDVUS", "NAME", "PHONE"};
    private List<Sotr> sotr;

    public SotrTableModel(List<Sotr> theSotrs) {
        sotr = theSotrs;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        return sotr.size();
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int row, int col) {

        Sotr tempSotr = sotr.get(row);

        switch (col) {
            case ID_COL:
                return tempSotr.getId();
            case IDVUS_COL:
                return tempSotr.getIdVus();
            case NAME_COL:
                return tempSotr.getName();
            case PHONE_COL:
                return tempSotr.getPhone();
            default:
                return tempSotr.getId();
        }
    }

    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
    
}
