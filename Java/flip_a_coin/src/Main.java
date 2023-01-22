import java.util.Scanner;

public class Main {
    private static void startGame(Player player1, Player player2) {
        Scanner in = new Scanner(System.in);

//        Ciclo for con l'effettiva partita.
//        Per 10 round, il ciclo si ripeterà due volte in quanto per ogni ciclo le giocate sono una per ogni giocatore
        for (int i = 0; i < 5; i++) {
//            printf permette di formattare una stringa
//            equivalente di fare "Turno di " + player1.getPlayerName() + ...
            System.out.printf("%nTurno di %s%nTesta o croce? ", player1.getPlayerName());

//            il metodo playGame prende come parametro la scelta dell'utente e controlla se
//            corrisponde a un lancio casuale
            player1.playGame(in.nextLine().toLowerCase());

            System.out.printf("%nTurno di %s%nTesta o croce? ", player2.getPlayerName());
//            .toLowerCase() evita typo da parte dell'utente come CROCE CroCe Croce ecc.
            player2.playGame(in.nextLine().toLowerCase());

//            a fine di ogni set di due round stampo a schermo il round attuale e il punteggio di p1 e p2
            System.out.printf("%nRound %d di %d terminato. [%d/%d]%n", i+1, 5, player1.getScore(), player2.getScore());
        }

//        dopo che il gioco è finito controllo il vincitore.
        if (player1.getScore() > player2.getScore()) {
            System.out.printf("%nIl giocatore %s vince!", player1.getPlayerName());
        } else if (player1.getScore() < player2.getScore()) {
            System.out.printf("%nIl giocatore %s vince!", player2.getPlayerName());
        } else {
            System.out.println("%nLa partita termina in pareggio.");
        }
    }

//    Utilizzo il main per prendere in input i nomi dei giocatori
//    Passo poi al metodo startGame() per il gioco effettivo
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci il nome del giocatore 1: ");
//        Creo gli oggetti player1 e player2, assegnando come parametro di ingresso
//        del constructor il nome dei rispettivi giocatori tramite in.nextLine()
        Player player1 = new Player(in.nextLine());

        System.out.println("Inserisci il nome del giocatore 2: ");
        Player player2 = new Player(in.nextLine());

        startGame(player1, player2);
    }
}