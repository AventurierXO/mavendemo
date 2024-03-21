package de.graebel.mavendemo;

public class Angestellte {
    private final String name;
    private int lohn;

    public Angestellte(String name, int lohn) {
        this.name = name;
        this.lohn = lohn;
    }

    public String getName() {
        return name;
    }

    public int getLohn() {
        return lohn;
    }

    public void setLohn(int neuerLohn) {
        this.lohn = neuerLohn;
    }

}
