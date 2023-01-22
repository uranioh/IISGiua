import java.util.Scanner;

public class Game {
    private boolean gameStatus;
    Anphor left = new Anphor(5);
    Anphor right = new Anphor(3);

    public Game() {
        gameStatus = true;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (gameStatus) {
            System.out.printf("""
                            L: [%d/%d]  R: [%d/%d]
                                                
                            1. Riempi L
                            2. Riempi R
                                                
                            3. Svuota L
                            4. Svuota R
                                                
                            5. L -> R
                            6. R -> L
                                                
                            7. Esci
                            >\040""",
                    left.getActualCapacity(), left.getTotalCapacity(),
                    right.getActualCapacity(), right.getTotalCapacity()
            );

            switch (scanner.nextInt()) {
                case 1 -> left.fill();
                case 2 -> right.fill();
                case 3 -> left.removeWater(left.getActualCapacity());
                case 4 -> right.removeWater(right.getActualCapacity());
                case 5 -> left.removeWater(left.getActualCapacity() - right.addWater(left.getActualCapacity()));
                case 6 -> right.removeWater(right.getActualCapacity() - left.addWater(right.getActualCapacity()));
                case 7 -> gameStatus = false;

                default -> System.out.println("Scelta non valida lol");
            }
            if (left.getActualCapacity() == 4) {
                System.out.println("Hai vinto!");
                gameStatus = false;
            }
        }
    }
}
