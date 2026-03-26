import java.util.Arrays;

public class studierender {
    private String name;
    private String matrikelnummer;
    private String studiengang;
    private boolean hatFegragt;

    public studierender (String name, String matrikelnummer, String studiengang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
        this.hatFegragt = false;
    }

    public String getName() {
        return name;
    }

    public String getMatrikelnummer() {
        return matrikelnummer;
    }

    public String getStudiengang () {
        return studiengang;
    }

    public boolean getHatGefragt() {
        return hatFegragt;
    }

    public void frageStellen (dozierender dozierender) {
        System.out.println("Frage stellen.");
        hatFegragt = true;
    }

    public void sprechstundeAnfragen (dozierender dozierender, String betreff, String anliegen, String zeitvotschlag) {
        System.err.println(betreff);
        System.out.print("Sehr geehrte");
        if (dozierender.getGeschlecht()) {
            System.out.print("r Herr ");
        }
        else {
            System.out.print(" Frau ");
        }
        System.out.println(dozierender.getName());
        System.out.println(anliegen);
        System.out.println("Mein Zeitvorschlag: " + zeitvotschlag);
        System.out.println(this.name + " Matrikelnummer:" + this.matrikelnummer + " Studiengang:" + this.studiengang);
    }
}
