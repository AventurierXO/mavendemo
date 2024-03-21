package de.graebel.mavendemo;

public class Chef extends Angestellte {
    public Chef(String name, int lohn) {
        super(name, lohn);
    }

    public void aendereLohnMitarbeiter(Angestellte mitarbeiter, int lohnaenderung) {
        if(lohnaenderung < 0) {
            throw new IllegalArgumentException("Der Lohn kann nicht negativ sein!");
        }
        mitarbeiter.setLohn(lohnaenderung);
    }
}
