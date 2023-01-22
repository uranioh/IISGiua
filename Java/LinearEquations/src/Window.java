import java.awt.*;
import javax.swing.*;

public class Window extends JFrame {
    WL WindowListener = new WL();

    Font f = new Font("Helvetica", Font.PLAIN, 20);
    Font specialFont = f.deriveFont(Font.PLAIN, 70);

    //    main structure
    JPanel topPanel = new JPanel();
    JPanel topPanelContainer = new JPanel();

    JPanel bottomPanel = new JPanel();
    JPanel bottomPanelContainer = new JPanel();

    JPanel firstRow = new JPanel();
    JPanel secondRow = new JPanel();
    JPanel thirdRow = new JPanel();
    JPanel fourthRow = new JPanel();

    //    first row items
    JTextField xInput_1 = new JTextField(4);
    JTextField yInput_1 = new JTextField(4);
    JTextField knownValue_1 = new JTextField(4);

    //    second row items
    JTextField xInput_2 = new JTextField(4);
    JTextField yInput_2 = new JTextField(4);
    JTextField knownValue_2 = new JTextField(4);

    //    third row items
    JTextField result_x = new JTextField(4);
    JButton calculate = new JButton("Calcola");

    //    fourth row items
    JTextField result_y = new JTextField(4);
    JButton cancel = new JButton("Cancella");

    public Window() {
        super("Window");

//        adding 1st row
        firstRow.add(xInput_1)
                .setFont(f);
        firstRow.add(new JLabel("x + "))
                .setFont(f);
        firstRow.add(yInput_1)
                .setFont(f);
        firstRow.add(new JLabel("y ="))
                .setFont(f);
        firstRow.add(knownValue_1)
                .setFont(f);

//        adding 2nd row
        secondRow.add(xInput_2)
                .setFont(f);
        secondRow.add(new JLabel("x + "))
                .setFont(f);
        secondRow.add(yInput_2)
                .setFont(f);
        secondRow.add(new JLabel("y ="))
                .setFont(f);
        secondRow.add(knownValue_2)
                .setFont(f);

//        adding 3rd row
        thirdRow.add(new JLabel("x ="))
                .setFont(f);

        result_x.setEditable(false);
        thirdRow.add(result_x)
                .setFont(f);

        thirdRow.add(calculate)
                .setFont(f);

//        adding 4th row
        fourthRow.add(new JLabel("y ="))
                .setFont(f);

        result_y.setEditable(false);
        fourthRow.add(result_y)
                .setFont(f);

        fourthRow.add(cancel)
                .setFont(f);

//        adding all rows to the top panel
        topPanelContainer.add(firstRow);
        topPanelContainer.add(secondRow);
        topPanelContainer.setLayout(new BoxLayout(topPanelContainer, BoxLayout.Y_AXIS));

        topPanel.add(new JLabel("{"))
                .setFont(specialFont);
        topPanel.add(topPanelContainer);

//        adding all rows to the bottom panel
        thirdRow.setLayout(new FlowLayout(FlowLayout.LEFT));
        fourthRow.setLayout(new FlowLayout(FlowLayout.LEFT));
        bottomPanelContainer.add(thirdRow);
        bottomPanelContainer.add(fourthRow);
        bottomPanelContainer.setLayout(new BoxLayout(bottomPanelContainer, BoxLayout.Y_AXIS));

        bottomPanel.add(new JLabel("{"))
                .setFont(specialFont);
        bottomPanel.add(bottomPanelContainer);

//        adding top and bottom panels to the main panel
        this.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 10));
        this.add(topPanel);
        this.add(bottomPanel);
        this.addWindowListener(WindowListener);
    }
}
