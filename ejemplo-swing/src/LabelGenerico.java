import javax.swing.*;

public class LabelGenerico extends JLabel {
    public LabelGenerico(){
        this.setVerticalAlignment(JLabel.TOP);
        this.setHorizontalAlignment(JLabel.CENTER);
    }

    public void setSuma(String total){
        this.setText(total);
    }
}
