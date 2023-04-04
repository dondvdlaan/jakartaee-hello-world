package org.eclipse.jakarta.hello;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Artikel {

    @Id
    @GeneratedValue
    private int artID;
    private String artName;
    private String artBeschreibung;
    
    public Artikel(String artName, String artBeschreibung) {
        this.artName = artName;
        this.artBeschreibung = artBeschreibung;
    }

    public int getartID() {
        return artID;
    }

    public void setartID(int artID) {
        this.artID = artID;
    }

    public String getartName() {
        return artName;
    }

    public void setartName(String artName) {
        this.artName = artName;
    }

    public String getartBeschreibung() {
        return artBeschreibung;
    }

    public void setartBeschreibung(String artBeschreibung) {
        this.artBeschreibung = artBeschreibung;
    }
}
