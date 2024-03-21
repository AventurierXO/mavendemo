package de.graebel.mavendemo;
public class Mavendemo {

	public static void main(String[] args) {
		Angestellte testAngestellte = new Angestellte("Johanna", 2500);
		Chef testChef = new Chef("Antonia", 3500);

		testChef.aendereLohnMitarbeiter(testAngestellte, 3000);
		System.out.println(testAngestellte.getLohn());
	}

}

