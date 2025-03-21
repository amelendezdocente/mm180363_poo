import javax.swing.*;

public class Main extends JFrame {
    private JLabel label1;
    private LabelGenerico label2;
    private JPanel panel1;
    public Main(){
        this.setSize(600, 200);
        this.setTitle("JFrame example");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        label1 = new JLabel("Este es un label de ejemplo");
        label1.setVerticalAlignment(JLabel.BOTTOM);
        label1.setHorizontalAlignment(JLabel.CENTER);

        label2 = new LabelGenerico();
        label2.setSuma("15");

        this.setContentPane(panel1);
    }

    public static void main(String[] args) {
        new Main();
    }
}