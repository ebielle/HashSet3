import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashSet<String> colori = new HashSet<>();
        String colore = "Verde";

        System.out.println("Gli elementi dell'hashSet sono:");
        for (String element : riempireColori(colori, colore)) {
            System.out.println(element);
        }

        riempireColori(colori, colore).removeAll(colori);
        System.out.println("L'hashSet \"colori\" è vuoto: " + colori.isEmpty());
        System.out.println(colori);
    }

    public static HashSet<String> riempireColori(HashSet<String> colori, String colore) {
        colori.add("Rosa");
        colori.add("Rosso");
        colori.add("Blu");
        colori.add("Verde");

        Iterator<String> iterator = colori.iterator();
        while (iterator.hasNext()) {
            if (colore.equals(iterator.next())) {
                iterator.remove();
            }
        }
        return colori;
    }
}