public class Main {
    public static void main(String[] args) {
        Window window = new Window();

        window.setFontRecursively(window);
        window.setGapsRecursively(window);
        window.pack();
        window.setDefaultCloseOperation(Window.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}