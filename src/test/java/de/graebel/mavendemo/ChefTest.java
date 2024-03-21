package de.graebel.mavendemo;

import org.junit.Assert;
import org.junit.Test;



public class ChefTest {

    @Test
    public void testLohnaenderung() {
        Chef chef = new Chef("Chef", 2000);
        Angestellte testAngestellte = new Angestellte("Angestellte", 1000);
        chef.aendereLohnMitarbeiter(testAngestellte, 1000);
        Assert.assertEquals(1000, testAngestellte.getLohn());
    }

}