package G05L.datos;

import G05L.connection.DatabaseConnection;

import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;
import java.sql.*;

public class CityDatos {
    private String sqlGetCities = "SELECT * FROM city LIMIT 1";

    public DefaultTableModel getSQLCities() throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            conn = DatabaseConnection.getConnection();
            ps = conn.prepareStatement(sqlGetCities);
            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int columns = rsmd.getColumnCount();
            for (int i = 1; i <= columns; i++) {
                modelo.addColumn(rsmd.getColumnName(i));
            }
            while(rs.next()){
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                modelo.addRow(row);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            conn.close();
        }
        return modelo;
    }
}
