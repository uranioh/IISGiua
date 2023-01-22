import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonListener implements ActionListener {
    private static String currentSelection;

    public void actionPerformed(ActionEvent e) {
        JRadioButton selection = (JRadioButton) e.getSource();
        currentSelection = selection.getText();
    }

    public static String getCurrentSelection() {
        return currentSelection;
    }
}
