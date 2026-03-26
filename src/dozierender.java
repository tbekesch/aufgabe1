public class dozierender {
    private String name;
    private String fakultaet;
    private int bueronummer;
    private boolean geschlecht; //true=maennlich, false=weiblich
    private String[] feedbackSpeicher = new String[0];

    public dozierender (String name, String fakultaet, int bueronummer, boolean geschlecht) {
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
        this.geschlecht = geschlecht;
    }

     public String getName() {
        return name;
    }

     public String getFakultaet() {
        return fakultaet;
    }

     public int getbueronummer() {
        return bueronummer;
    }

    public boolean getGeschlecht() {
        return geschlecht;
    }

    public String[] getFeedbackSpeicher() {
        return this.feedbackSpeicher;
    }

    public void frageBeantworten (studierender studierender) {
        if (studierender.getHatGefragt()) {
            System.out.println("Frage beantworten.");
            return;
        }
        System.out.println("Studierende hat keine Frage gestellt.");
    }

    public void erhalteFeedback(String neuesFeedback) {
        String[] neuesArray = new String[this.feedbackSpeicher.length + 1];
        for (int i = 0; i < this.feedbackSpeicher.length; i++) {
            neuesArray[i] = this.feedbackSpeicher[i];
        }
        neuesArray[neuesArray.length - 1] = neuesFeedback;
        this.feedbackSpeicher = neuesArray;
        System.out.println("Feedback wurde hinzugefügt. Aktuelle Anzahl: " + feedbackSpeicher.length);
    }
}