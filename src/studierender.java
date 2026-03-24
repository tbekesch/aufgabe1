public class studierender {
    private String name;
    private String matrikelnummer;
    private String studiengang;

    public studierender (String name, String matrikelnummer, String studiengang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    public String frageStellen (dozierender dozierender) {
        return "Meine Frage";
    }
}
