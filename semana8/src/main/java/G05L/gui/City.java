package G05L.gui;

import G05L.datos.CityDatos;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.SQLException;

public class City extends JFrame {

    private JTextField JTextCityCode;
    private JButton JButtonGetCities;
    private JTable JTableCities;
    private JPanel jpanelFrame1;

    //Variables para los datos
    private DefaultTableModel tableModel = null;
    private CityDatos cityDatos = new CityDatos();

    private City(String Title) throws SQLException {
        super(Title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(jpanelFrame1);
        this.setMinimumSize(new Dimension(500,500));

        //Agregando data
        tableModel = cityDatos.getSQLCities();
        JTableCities.setModel(tableModel);
    }

    public static void main(String[] args) throws SQLException {
        JFrame frame = new City("Cities");
        frame.setVisible(true);
    }
}
