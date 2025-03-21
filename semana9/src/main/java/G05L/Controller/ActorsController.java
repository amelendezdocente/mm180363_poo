package G05L.Controller;

import G05L.Model.Actors.DataActors;

import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;

public class ActorsController {
    public DefaultTableModel getTableModel() throws SQLException {
        DataActors dataActors = new DataActors();
        DataToController d2c = dataActors.getSQLActors();

        return  d2c.getTableModel();
    }
}
