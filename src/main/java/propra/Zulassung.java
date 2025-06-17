package propra;

import java.util.*;

public class Zulassung {
    public static void main(String[] args) {
        Zulassung zulassung = new Zulassung();
        System.out.println("\n// -- Ausgabe der main-Methode -\n");
        zulassung.listen();
        System.out.println("\n// -----------------------------\n");
        zulassung.hashmap();
        System.out.println("\n// -- Ende Ausgabe main --------\n");
    }

    private void listen() {
        // Beginnen Sie hier
        List<Integer> punktzahlen = new ArrayList<>();
        punktzahlen.add(42);
        punktzahlen.add(23);
        punktzahlen.add(12);
        punktzahlen.add(54);
        punktzahlen.add(20);
        punktzahlen.remove(2);
        Collections.sort(punktzahlen);
        for (int punkt : punktzahlen) {
            System.out.println(punkt);
        }
        int summe = 0;
        int bestehende = 0;
        for (int punkt : punktzahlen) {
            summe += punkt;
            if (punkt >= 30) {
                bestehende++;
            }
            int durchschnitt = summe / punktzahlen.size();
            System.out.println("Durchschnitt: " + durchschnitt);
            System.out.println("Bestanden: " + bestehende + " von " + punktzahlen.size());

        }
    }


    private void hashmap() {
        // Für den Aufgabenteil danach
        HashMap<Integer, Double> matrikelnummerPunkte = new HashMap<>();
        matrikelnummerPunkte.put(1942000, 42.0);
        matrikelnummerPunkte.put(1972300, 23.0);
        matrikelnummerPunkte.put(203400, 12.0);
        System.out.println(matrikelnummerPunkte);
        matrikelnummerPunkte.put(1942000, 50.0);
        Double punkte = matrikelnummerPunkte.get(1972300);
        System.out.println("punkte für 1972300 : " + punkte);
        System.out.println(matrikelnummerPunkte.get(197333)); // Unbekannte Matrikelnummer nachschlagen: wird "null" ausgeben, da es keinen Wert für diesen Schlüssel gibt.
        System.out.println(matrikelnummerPunkte.getOrDefault(19864, 0.0)); // falls ein Schlüssel nicht vorhanden ist, kann mit dieser Methode "getOrDefault" einen Standardwert angeben.
        for (Map.Entry<Integer, Double> eintrag : matrikelnummerPunkte.entrySet()) {
            System.out.println("%d hat %6.2f Punkte".formatted(eintrag.getKey(), eintrag.getValue()));
        }

    }

}

