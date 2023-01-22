import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    JPanel player1Panel = new JPanel();
    JLabel player1Label = new JLabel("Player 1");
    JTextField player1Score = new JTextField("0");

    JButton roll = new JButton("Roll");

    JPanel player2Panel = new JPanel();
    JLabel player2Label = new JLabel("Player 2");
    JTextField player2Score = new JTextField("0");

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
    private ImageIcon[] getDiceLabels() {
        ImageIcon[] diceIcons = new ImageIcon[6];
        Image[] diceImages = new Image[6];

        for (int i = 0; i < diceIcons.length; i++) {
            diceIcons[i] = new ImageIcon(String.format("src/assets/%d.gif", i + 1));
        }

        for (int i = 0; i < diceImages.length; i++) {
            diceImages[i] = diceIcons[i].getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        }

        for (int i = 0; i < diceIcons.length; i++) {
            diceIcons[i] = new ImageIcon(diceImages[i]);
        }

        return diceIcons;
    }
    public Window() {
        super("Lancia un dado! O forse due?");

        ImageIcon[] diceIcons = getDiceLabels();
        JLabel player1Dice = new JLabel(diceIcons[0]);
        JLabel player2Dice = new JLabel(diceIcons[0]);

        setLayout(new GridLayout(1, 3, 10, 10));

        player1Panel.setLayout(new GridLayout(2, 1));
        player1Panel.add(player1Label);
        player1Panel.add(player1Score);
        player1Score.setEditable(false);
        add(player1Panel);

        add(player1Dice);
        roll.addActionListener(new AL(this, player1Dice, player2Dice, diceIcons));
        roll.setBackground(Color.GRAY);
        roll.setForeground(Color.WHITE);
        add(roll);
        add(player2Dice);

        player2Panel.setLayout(new GridLayout(2, 1));
        player2Panel.add(player2Label);
        player2Panel.add(player2Score);
        player2Score.setEditable(false);
        add(player2Panel);
    }
}
