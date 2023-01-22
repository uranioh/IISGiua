import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    AL ActionListener = new AL(this);

    JPanel inputPanel = new JPanel();
    JPanel outputPanel = new JPanel();

    JLabel inputLabel = new JLabel("Input");
    JLabel outputLabel = new JLabel("È un numero primo?");

    JTextField inputField = new JTextField();
    JTextField outputField = new JTextField();

    JButton checkButton = new JButton("Controlla");

    public void setFontRecursively(Component component) {
        component.setFont(new Font("Arial", Font.PLAIN, 20));
        if (component instanceof Container) {
            for (Component child : ((Container) component).getComponents()) {
                setFontRecursively(child);
            }
        }
    }

    public void setGapsRecursively(Component component) {
        if (component instanceof Container) {
            for (Component child : ((Container) component).getComponents()) {
                setGapsRecursively(child);
            }
        }
        if (component instanceof JComponent) {
            ((JComponent) component).setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        }
    }

    public Window() {
        super("Numeri primi");
//        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setLayout(new GridLayout(3, 1));

        inputPanel.setLayout(new GridLayout(1, 2, 10, 10));
        inputPanel.add(inputLabel);
        inputPanel.add(inputField);

        outputPanel.setLayout(new GridLayout(1, 2, 10, 10));
        outputPanel.add(outputLabel);

        outputField.setEditable(false);
        outputPanel.add(outputField);

        add(inputPanel);
        add(outputPanel);

        checkButton.setBackground(Color.GRAY);
        checkButton.setForeground(Color.WHITE);
        checkButton.setFocusPainted(false);
        add(checkButton);
        checkButton.addActionListener(ActionListener);
    }
}
