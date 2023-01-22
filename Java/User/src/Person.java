import java.time.LocalDate;

public class Person {
    private final String fName, lName;
    private final int birthYear;

    private final static LocalDate current_date = LocalDate.now();
    public final static int currentYear = current_date.getYear();

    public Person(String fName, String lName, int birthYear) {

        this.fName = fName;
        this.lName = lName;
        this.birthYear = birthYear;
    }


    public int getAge() {
        return currentYear-birthYear;
    }

    public String getInfo() {
        return String.format(
                """
                Nome: %s
                Cognome: %s
                Anno di nascita: %d
                Età: %d
                """,
                fName, lName, birthYear, getAge());
    }
}
