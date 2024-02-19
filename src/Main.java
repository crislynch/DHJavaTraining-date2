import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Creazione dell'OffsetDateTime dalla stringa
        String inputString = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = OffsetDateTime.parse(inputString);

        // Formattazione della data nel formato desiderato
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        // Stampa della data formattata sulla console
        System.out.println("Data formattata: " + dateTime.format(formatter));
    }
}