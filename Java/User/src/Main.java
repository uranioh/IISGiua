import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci i dati anagrafici dell'utente: ");

        System.out.println("Nome: ");
        String fName = in.nextLine();

        System.out.println("Cognome: ");
        String lName = in.nextLine();

        System.out.println("Anno di nascita: ");
        int birthYear = in.nextInt();

        while (birthYear < 1900 || birthYear > Person.currentYear) {
            System.out.println("Anno di nascita non valido.");
            System.out.println("Anno di nascita: ");
            birthYear = in.nextInt();
        }

        Person user1 = new Person(fName, lName, birthYear);

        System.out.println(user1.getInfo());
    }
}