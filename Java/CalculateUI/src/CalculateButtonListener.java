import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateButtonListener implements ActionListener {
    private final JTextField resultField;

    public CalculateButtonListener(JTextField resultField) {
        this.resultField = resultField;
    }

    public void actionPerformed(ActionEvent e) {
        switch (RadioButtonListener.getCurrentSelection()) {
            case "Addition" -> {
                float result = Window.getFirstNumber() + Window.getSecondNumber();
                resultField.setText(String.valueOf(result));
            }
            case "Subtraction" -> {
                float result = Window.getFirstNumber() - Window.getSecondNumber();
                resultField.setText(String.valueOf(result));
            }
            case "Multiplication" -> {
                float result = Window.getFirstNumber() * Window.getSecondNumber();
                resultField.setText(String.valueOf(result));
            }
            case "Division" -> {
                float result = Window.getFirstNumber() / Window.getSecondNumber();
                resultField.setText(String.valueOf(result));
            }
        }
    }
}
