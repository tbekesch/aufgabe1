
public class lehrveranstaltung {
    private String titel;
    private dozierender[] dozierende;
    private studierender[] studierende;
    private vorlesungsstunde[] vorlesungsstunden;
    private praktikumsstunde[] praktikumsstunden;

    public lehrveranstaltung(String titel, dozierender[] dozierende, studierender[] studierende, vorlesungsstunde[] vorlesungsstunden, praktikumsstunde[] praktikumsstunden) {
        this.titel = titel;
        this.dozierende = new dozierender[dozierende.length];
        for (int i = 0; i < dozierende.length; i++) {
            this.dozierende[i] = dozierende[i];
        }
        this.studierende = new studierender[studierende.length];
        for (int i = 0; i < studierende.length; i++) {
            this.studierende[i] = studierende[i];
        }
        this.vorlesungsstunden = new vorlesungsstunde[vorlesungsstunden.length];
        for (int i = 0; i < vorlesungsstunden.length; i++) {
            this.vorlesungsstunden[i] = vorlesungsstunden[i];
        }
        this.praktikumsstunden = new praktikumsstunde[praktikumsstunden.length];
        for (int i = 0; i < praktikumsstunden.length; i++) {
            this.praktikumsstunden[i] = praktikumsstunden[i];
        }
    }

    public void addStudierender(studierender studierender) {
        studierender[] neuesArray = new studierender[this.studierende.length + 1];
        for (int i = 0; i < this.studierende.length; i++) {
            neuesArray[i] = this.studierende[i];
        }
        neuesArray[neuesArray.length - 1] = studierender;
        this.studierende = neuesArray;
        System.out.println(studierender.getName() + " wurde zur Veranstaltung hinzugefuegt.");
    }

    public void removeStudierender(studierender studierender) {
        for (int i = 0; i < this.studierende.length; i++) {
            if (studierende[i] != null && studierende[i].getMatrikelnummer().equals(studierender.getMatrikelnummer())) {
                studierende[i] = null;
                System.out.println(studierender.getName() + " wurde aus Veranstaltung geloescht.");
                return;
            }
        }
        System.out.println(studierender.getName() + " ist nicht in Veranstaltung.");
    }

    public void addVorlesungsstunde(vorlesungsstunde vorlesungsstunde) {
        vorlesungsstunde[] neuesArray = new vorlesungsstunde[this.vorlesungsstunden.length + 1];
        for (int i = 0; i < this.vorlesungsstunden.length; i++) {
            neuesArray[i] = this.vorlesungsstunden[i];
        }
        neuesArray[neuesArray.length - 1] = vorlesungsstunde;
        this.vorlesungsstunden = neuesArray;
        System.out.println(vorlesungsstunde.getThema() + " wurde zur Veranstaltung hinzugefuegt.");
    }

    public void addPraktikumsstunde(praktikumsstunde praktikumsstunde) {
        praktikumsstunde[] neuesArray = new praktikumsstunde[this.praktikumsstunden.length + 1];
        for (int i = 0; i < this.praktikumsstunden.length; i++) {
            neuesArray[i] = this.praktikumsstunden[i];
        }
        neuesArray[neuesArray.length - 1] = praktikumsstunde;
        this.praktikumsstunden = neuesArray;
        System.out.println(praktikumsstunde.getThema() + " wurde zur Veranstaltung hinzugefuegt.");
    }

    public void DetailsAnzeigen() {
        System.out.println("Vorlesungname: " + titel);
        System.out.println("Dozierende:");
        for (dozierender dozierender : dozierende) {        
            System.out.println("- " + dozierender.getName());
        }
        System.out.println("Studierende:");
        for (studierender studierender : studierende) {   
            if (studierender != null) {
                System.out.println("- " + studierender.getName());
            }
        }
        System.out.println("Vorlesungsstunden:");
        for (vorlesungsstunde vorlesungsstunde : vorlesungsstunden) {        
            System.out.println("- " + vorlesungsstunde.getThema());
        }
        System.out.println("Praktikumsstunden:");
        for (praktikumsstunde praktikumsstunde : praktikumsstunden) {        
            System.out.println("- " + praktikumsstunde.getThema());
        }
    }
}
