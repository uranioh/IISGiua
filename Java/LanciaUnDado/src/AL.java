import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AL implements ActionListener {
    Random r = new Random();

    Window window;
    JLabel player1Dice;
    JLabel player2Dice;
    ImageIcon[] diceIcons;

    public AL(Window window, JLabel player1Dice, JLabel player2Dice, ImageIcon[] diceIcons) {
        this.window = window;
        this.player1Dice = player1Dice;
        this.player2Dice = player2Dice;
        this.diceIcons = diceIcons;
    }
    public void actionPerformed(ActionEvent e) {
        int player1Roll = r.nextInt(6);
        int player2Roll = r.nextInt(6);

        player1Dice.setIcon(diceIcons[player1Roll]);
        player2Dice.setIcon(diceIcons[player2Roll]);

        if (player1Roll > player2Roll) {
            window.player1Score.setText(String.valueOf(Integer.parseInt(window.player1Score.getText()) + 1));
        } else if (player2Roll > player1Roll) {
            window.player2Score.setText(String.valueOf(Integer.parseInt(window.player2Score.getText()) + 1));
        }

        if (Integer.parseInt(window.player1Score.getText()) == 10) {
            JOptionPane.showMessageDialog(null, "Il giocatore 1 vince!");
            System.exit(0);
        } else if (Integer.parseInt(window.player2Score.getText()) == 10) {
            JOptionPane.showMessageDialog(null, "Il giocatore 2 vince!");
            System.exit(0);
        }
    }
}
