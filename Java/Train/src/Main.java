import java.util.Scanner;

public class Main {
    private static int nextStopIndex = 0;
    private static boolean nextStopDirection = true;

    public static String getNextStop() {
        String[] trainStops = {"Cagliari", "Lottizzazione Picciau", "Frutti d'Oro", "Torre degli Ulivi",
                "Villa d'Orri", "Sarroch", "Villa San Pietro", "Pula", "Santa Margherita", "Chia",
                "Domus De Maria", "Teulada", "Sant'Anna Arresi"};

        if (nextStopIndex == trainStops.length - 1) {
            nextStopDirection = false;
        } else if (nextStopIndex == 0) {
            nextStopDirection = true;
        }

        if (nextStopDirection) {
            nextStopIndex++;
        } else {
            nextStopIndex--;
        }

        return trainStops[nextStopIndex];
    }

    public static void main(String[] args) {
        boolean loopStatus = true;
        Scanner s = new Scanner(System.in);

        System.out.println("Inserisci il numero di vagoni del treno e il numero massimo di passeggeri per ogni vagone");
        Train train = new Train(s.nextInt(), s.nextInt());

        while (loopStatus) {
            System.out.printf("""
                            %n
                            Fermata: %s
                            Capacità totale del treno: %d%%
                            Numero passeggeri a bordo: %d/%d
                                                
                            1. Aggiungi passeggeri
                            2. Rimuovi passeggeri
                            3. Visualizza dettagli vagoni
                            4. Salta la fermata
                                                
                            0. Esci
                            """,
                    getNextStop(),
                    (train.getTotalPassengers() * 100) / train.getMaxPassengers(),
                    train.getTotalPassengers(),
                    train.getMaxPassengers()
            );

            int option = s.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.println("Inserisci il numero di passeggeri da aggiungere: ");
                    train.addPassengers(s.nextInt());
                }
                case 2 -> {
                    System.out.println("Inserisci il numero di passeggeri da rimuovere: ");
                    train.removePassengers(s.nextInt());
                }
                case 3 -> train.getPassengers();
                case 4 -> System.out.println("Fermata saltata.");

                case 0 -> loopStatus = false;

                default -> System.out.println("Opzione non valida");
            }
        }
    }
}