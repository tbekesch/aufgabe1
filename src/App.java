public class App {
    public static void main(String[] args) throws Exception {
        studierender studentA = new studierender("Alice", "al111", "UXD");
        dozierender dozentM = new dozierender("Mueller", "Informatik", 123, true);
        dozentM.frageBeantworten(studentA);
        studentA.frageStellen(dozentM);
        dozentM.frageBeantworten(studentA);

        studentA.sprechstundeAnfragen(dozentM, "Frage zur Vorlesung Algorithmen & Datenstrukturen", "Ich habe eine Verständnisfrage zur Laufzeitanalyse von Quicksort.", "2026-04-15, 14:00 - 14:15 Uhr");

    }
}
