public class vorlesungsstunde {
    private String thema;
    private String datum;
    private String uhrzeit;
    private String raum;

    public vorlesungsstunde(String thema, String datum, String uhrzeit, String raum) {
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
    }

        public String getThema() {
            return thema;
        }
    
        public String getDatum() {
            return datum;
        }
    
        public String getUhrzeit() {
            return uhrzeit;
        }
    
        public String getRaum() {
            return raum;
        } 

    public void DetailsAnzeigen() {
        System.out.println("Thema: " + this.thema);
        System.out.println("Datum: " + this.datum);
        System.out.println("Uhrzeit: " + this.uhrzeit);
        System.out.println("Raum: " + this.raum);
    }   
}
