package at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.entities;


import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Beschreibung {


    @Column(name = "beschreibung", unique = true, updatable = true)
    private String beschreibung;


    public Beschreibung(){}

    public Beschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }
}
