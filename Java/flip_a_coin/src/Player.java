import java.util.Objects;
import java.util.Random;

public class Player {
    private final String playerName;
    private int score;

//    constructor
    public Player(String playerName) {
        this.playerName = playerName;
    }

    public void playGame(String choice) {
//        Dichiaro l'oggetto random
        Random random = new Random();

//        Creo un array con le possibili mosse
        String[] choices = {"testa", "croce"};

//        Genero un numero da 0 a 2 escluso per scegliere uno dei due item dell'array
//        Lo confronto di conseguenza alla scelta del giocatore
        if (Objects.equals(choice, choices[random.nextInt(2)])) {
            System.out.printf("È uscito %s! %s guadagna un punto.%n", choice, playerName);
//            In caso l'utente azzecchi la mossa aumento il suo punteggio
            score++;
        }
        else {
//            Altrimenti too bad so sad.
            System.out.printf("Purtroppo non è uscito %s. Nessun punto è stato attribuito.%n", choice);
        }
    }

//    Getter basici per ottenere punteggio e nome del giocatore nel main
    public String getPlayerName() {
        return playerName;
    }

    public int getScore() {
        return score;
    }
}
