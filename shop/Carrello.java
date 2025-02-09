
import java.util.Scanner;

/* Esercizio  6 feb 2025
Ciao @here!
Integriamo adesso l’override nell’esercizio precedente.
Nota: lavoriamo sulla stessa repo.
Nome repo: java-inheritance-shop
Nel progetto java-inheritance-shop create una classe Carrello con metodo main, in cui chiedete all’utente di valorizzare un carrello di prodotti con dati inseriti tramite scanner.
Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno Smarphone o un Televisore o Cuffie e in base alla scelta dell’utente utilizzate il costruttore opportuno.
Al termine dell’inserimento stampate il carrello (fate l’override del metodo toString per restituire le informazioni da stampare per ogni classe) Buon lavoro!
 */

public class Carrello {
    public static void main(String[] args) {

// Oggetto Scanner
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Benvenuto nello Zimo's shop! Inserisci il nome del prodotto che desideri visualizzare: ");
        String prodottoScelto = scan.nextLine();

// Oggetto 1
        Cuffie cuffieTool = new Cuffie(33, "Duo", "Sony", 22.00, 22.00, "aqua", false);
// Oggetto 2
        Televisore televisoreTool = new Televisore(34, "Trio", "Samsung", 123.99, 22.00, 32, false);
// Oggetto 3
// Non mi funziona il costruttore di telefono, ho usato solo due costruttori
        /* Smartphone telefonoTool = new Smartphone(35, "Trio", "Samsung", 123.99d, 22.00d, 123456789098765L, 16.00d); */

        if (prodottoScelto.equals("cuffie")) {
            System.out.println(cuffieTool);
        } else if (prodottoScelto.equals("televisore")) {
            System.out.println(televisoreTool);
        } else {
            System.out.println("Prodotto non disponibile.");
        }
        
        scan.close();
}
}

