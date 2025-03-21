package G05L.Model.Actors;

import G05L.Controller.DataToController;
import G05L.Model.Connection.DatabaseConnection;

import java.sql.*;

public class DataActors {
    private String sqlGetActors = "SELECT * FROM actor LIMIT 5";

    public DataToController getSQLActors() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ResultSetMetaData rsmd = null;
        DataToController d2c = new DataToController();

        try{
            conn = DatabaseConnection.getConnection();
            ps = conn.prepareStatement(sqlGetActors);
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            int columns = rsmd.getColumnCount();

            for (int i = 1; i <= columns; i++) {
                d2c.setColumnToModel(rsmd.getColumnName(i));
            }

            while(rs.next()){
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                d2c.setRowToModel(row);
            }

        } catch (SQLException e){
            throw new RuntimeException(e);
        } finally {
            conn.close();
        }

        return d2c;
    }
}
