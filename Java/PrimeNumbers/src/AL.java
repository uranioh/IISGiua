import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AL implements ActionListener {
    Window window;

    public AL(Window window) {
        this.window = window;
    }

    public void actionPerformed(ActionEvent e) {
        String inputValue = window.inputField.getText();
        try {
            int num = Integer.parseInt(inputValue);
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                window.outputField.setText("Sì");
                window.outputField.setForeground(new Color(0, 200, 0));
            } else {
                window.outputField.setText("No");
                window.outputField.setForeground(Color.RED);
            }
        } catch (NumberFormatException exception) {
            window.outputField.setText("Mistero");
            window.outputField.setForeground(Color.RED);
        }
    }
}
