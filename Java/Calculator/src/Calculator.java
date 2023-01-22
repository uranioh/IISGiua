import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame {
    public Calculator() {
        super("Calculator");
        Container c = this.getContentPane();

        JButton[][] buttons = new JButton[4][4];

        buttons[0][0] = new JButton("1"); buttons[0][1] = new JButton("2"); buttons[0][2] = new JButton("3"); buttons[0][3] = new JButton("+");
        buttons[1][0] = new JButton("4"); buttons[1][1] = new JButton("5"); buttons[1][2] = new JButton("6"); buttons[1][3] = new JButton("-");
        buttons[2][0] = new JButton("7"); buttons[2][1] = new JButton("8"); buttons[2][2] = new JButton("9"); buttons[2][3] = new JButton("*");
        buttons[3][0] = new JButton("."); buttons[3][1] = new JButton("0"); buttons[3][2] = new JButton("="); buttons[3][3] = new JButton("/");

        c.setLayout(new GridLayout(4, 4, 10, 10));



//        buttons properties n shit
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                c.add(buttons[i][j]);
                buttons[i][j].setFont(new Font("Arial", Font.PLAIN, 24));
                buttons[i][j].setFocusPainted(false);
                buttons[i][j].setBackground(Color.WHITE);
            }
        }



        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pack();
        setSize(400, 600);
        setVisible(true);
    }
}