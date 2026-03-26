public class App {
    public static void main(String[] args) throws Exception {
        studierender studentA = new studierender("Alice", "al111", "UXD");
        dozierender dozentM = new dozierender("Mueller", "Informatik", 123, true);
        dozentM.frageBeantworten(studentA);
        studentA.frageStellen(dozentM);
        dozentM.frageBeantworten(studentA);
        studierender studentB = new studierender("Bob", "bo222", "Informatik");

        studentA.sprechstundeAnfragen(dozentM, "Frage zur Vorlesung Algorithmen & Datenstrukturen", "Ich habe eine Verständnisfrage zur Laufzeitanalyse von Quicksort.", "2026-04-15, 14:00 - 14:15 Uhr");

        vorlesungsstunde vorlesung1 = new vorlesungsstunde("Algorithmen & Datenstrukturen", "2026-04-01", "10:00 - 12:00 Uhr", "Hörsaal 1");    
        vorlesung1.DetailsAnzeigen();
        System.err.println();
        praktikumsstunde praktikumsstunde1 = new praktikumsstunde("Algorithmen & Datenstrukturen", "2026-04-08", "14:00 - 16:00 Uhr", "Labor 2", new String[] {"Implementierung von Sortieralgorithmen", "Analyse der Laufzeit von Suchalgorithmen"});  
        praktikumsstunde1.DetailsAnzeigen();
        System.err.println();
        lehrveranstaltung veranstaltung1 = new lehrveranstaltung("Algorithmen & Datenstrukturen", new dozierender[] {dozentM}, new studierender[] {studentA}, new vorlesungsstunde[] {vorlesung1}, new praktikumsstunde[] {praktikumsstunde1});
        veranstaltung1.addStudierender(studentB);
        veranstaltung1.DetailsAnzeigen();
        System.err.println();
        veranstaltung1.removeStudierender(studentA);
        veranstaltung1.DetailsAnzeigen();
        System.err.println();
    }
}
