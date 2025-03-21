package G05L.Views;

import G05L.Controller.ActorsController;
import G05L.Controller.DataToController;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.SQLException;

public class Actors extends JFrame {
    private JTable JTableActors1;
    private JPanel JPanelActors1;
    private ActorsController ac = new ActorsController();

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public Actors(String title) throws SQLException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(JPanelActors1);
        this.setMinimumSize(new Dimension(500,500));

        DefaultTableModel actorsModel = ac.getTableModel();
        JTableActors1.setModel(actorsModel);
    }

    public static void main(String[] args) throws SQLException {
        JFrame frame = new Actors("Pantalla de actores");
        frame.setVisible(true);
    }
}
