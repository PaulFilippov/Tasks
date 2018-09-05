package labsKorolev.Lab3SwingAndJDBC.TableModels;

import javax.swing.table.AbstractTableModel;

import labsKorolev.Lab3SwingAndJDBC.Entities.Vus;

import java.util.*;

public class VusTableModel extends AbstractTableModel {

    private static final int ID_COL = 0;
    private static final int NAME_COL = 1;
    private static final int ADRESS_COL = 2;

    private String[] columnNames = {"ID", "NAME", "ADRESS"};
    private List<Vus> vus;

    public VusTableModel(List<Vus> theVuss) {
        vus = theVuss;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        return vus.size();
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int row, int col) {

        Vus tempVus = vus.get(row);

        switch (col) {
            case ID_COL:
                return tempVus.getId();
            case NAME_COL:
                return tempVus.getName();
            case ADRESS_COL:
                return tempVus.getAdress();
            default:
                return tempVus.getId();
        }
    }

    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

}