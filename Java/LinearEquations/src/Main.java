import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Window window = new Window();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setSize(450, 250);
        window.setVisible(true);
    }
}