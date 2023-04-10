package org.eclipse.jakarta.hello;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
@Named
@RequestScoped
public class Artikel implements Serializable {

    @Id
    @GeneratedValue
    private int artID;
    private String artName;
    private String artBeschreibung;

    public Artikel() {
    }

    public Artikel(String artName, String artBeschreibung) {
        this.artName = artName;
        this.artBeschreibung = artBeschreibung;
    }

    public int getArtID() {
        return artID;
    }

    public void setArtID(int artID) {
        this.artID = artID;
    }

    public String getArtName() {
        return artName;
    }

    public void setArtName(String artName) {
        this.artName = artName;
    }

    public String getArtBeschreibung() {
        return artBeschreibung;
    }

    public void setArtBeschreibung(String artBeschreibung) {
        this.artBeschreibung = artBeschreibung;
    }

    @Override
    public String toString() {
        return "Artikel{" +
                "artID=" + artID +
                ", artName='" + artName + '\'' +
                ", artBeschreibung='" + artBeschreibung + '\'' +
                '}';
    }
}
