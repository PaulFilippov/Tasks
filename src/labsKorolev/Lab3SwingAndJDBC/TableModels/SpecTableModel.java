package labsKorolev.Lab3SwingAndJDBC.TableModels;

import labsKorolev.Lab3SwingAndJDBC.Entities.Spec;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class SpecTableModel extends AbstractTableModel {

    private static final int ID_COL = 0;
    private static final int IDVUS_COL = 1;
    private static final int NAME_COL = 2;
    private static final int INFO_COL = 3;

    private String[] columnNames = {"ID", "IDVUS", "NAME", "INFO"};
    private List<Spec> spec;

    public SpecTableModel(List<Spec> theSpecs) {
        spec = theSpecs;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        return spec.size();
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int row, int col) {

        Spec tempSpec = spec.get(row);

        switch (col) {
            case ID_COL:
                return tempSpec.getId();
            case IDVUS_COL:
                return tempSpec.getidvus();
            case NAME_COL:
                return tempSpec.getName();
            case INFO_COL:
                return tempSpec.getInfo();
            default:
                return tempSpec.getId();
        }
    }

    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

}
