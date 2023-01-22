import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame {
    JPanel inputPanel = new JPanel();
    JLabel firstNumberLabel = new JLabel("First number");
    JTextField firstNumberField = new JTextField(10);
    JLabel secondNumberLabel = new JLabel("Second number");
    JTextField secondNumberField = new JTextField(10);

    JPanel radioButtonPanel = new JPanel();
    JRadioButton additionRadioButton = new JRadioButton("Addition");
    JRadioButton subtractionRadioButton = new JRadioButton("Subtraction");
    JRadioButton multiplicationRadioButton = new JRadioButton("Multiplication");
    JRadioButton divisionRadioButton = new JRadioButton("Division");


    JPanel outputPanel = new JPanel();
    JButton calculateButton = new JButton("Calculate");
    JTextField resultField = new JTextField(10);

    RadioButtonListener actionRadioButtonListener = new RadioButtonListener();
    CalculateButtonListener calculateButtonListener = new CalculateButtonListener(resultField);

    private static float firstNumber;
    private static float secondNumber;

    public static float getFirstNumber() {
        return firstNumber;
    }

    public static float getSecondNumber() {
        return secondNumber;
    }

    public Window() {
        super("Calcolatrice");
        Container c = getContentPane();
        c.setLayout(new BoxLayout(c, BoxLayout.PAGE_AXIS));

        c.add(inputPanel);
        inputPanel.setLayout(new GridLayout(2, 2));
        inputPanel.add(firstNumberLabel);
        inputPanel.add(secondNumberLabel);
        inputPanel.add(firstNumberField);
        inputPanel.add(secondNumberField);

        c.add(radioButtonPanel);
        ButtonGroup group = new ButtonGroup();
        group.add(additionRadioButton);
        group.add(subtractionRadioButton);
        group.add(multiplicationRadioButton);
        group.add(divisionRadioButton);

        radioButtonPanel.add(additionRadioButton);
        radioButtonPanel.add(subtractionRadioButton);
        radioButtonPanel.add(multiplicationRadioButton);
        radioButtonPanel.add(divisionRadioButton);

        additionRadioButton
                .addActionListener(actionRadioButtonListener);
        subtractionRadioButton
                .addActionListener(actionRadioButtonListener);
        multiplicationRadioButton
                .addActionListener(actionRadioButtonListener);
        divisionRadioButton
                .addActionListener(actionRadioButtonListener);

        c.add(outputPanel);
        outputPanel.add(calculateButton);

        calculateButton
                .addActionListener(calculateButtonListener);

        calculateButton.setAction(
                new AbstractAction("Calculate") {
                    public void actionPerformed(ActionEvent e) {
                        firstNumber = Float.parseFloat(firstNumberField.getText());
                        secondNumber = Float.parseFloat(secondNumberField.getText());
                    }
                }
        );

        outputPanel.add(resultField);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
