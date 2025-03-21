package G05L.Controller;

import javax.swing.table.DefaultTableModel;

public class DataToController {
    private DefaultTableModel tableModel;

    public void setColumnToModel(Object columnName){
        this.tableModel.addColumn(columnName);
    }

    public void setRowToModel(Object[] row){
        this.tableModel.addRow(row);
    }

    public DefaultTableModel getTableModel(){
        return this.tableModel;
    }

    public void setTableModel(DefaultTableModel tableModel) {
        this.tableModel = tableModel;
    }
}
