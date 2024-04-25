import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashSet<String> colori = new HashSet<>();

        String colore = "Verde";

        colori = riempireColori(colori);


        Iterator<String> iterator = colori.iterator();
        while (iterator.hasNext()) {
            if (colore == iterator.next()) {
                iterator.remove();
            }
        }

        colori.removeAll(colori);
        System.out.println("L'hashSet \"colori\" è vuoto: " + colori.isEmpty());
        System.out.println(colori);
        }

        public static HashSet<String> riempireColori (HashSet < String > colori) {
            colori.add("Rosa");
            colori.add("Rosso");
            colori.add("Blu");
            colori.add("Verde");

            return colori;

        }
    }
