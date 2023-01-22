import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Window window = new Window();

        window.setFontRecursively(window);
        window.setGapsRecursively(window);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setVisible(true);
    }
}