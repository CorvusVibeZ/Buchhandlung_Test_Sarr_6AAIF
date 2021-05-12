package at.itkollegimst.sarr.pos1makro.test2.buchdruckms.domain.model.aggregates;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class BuchdruckNummer implements Serializable {


    @Column(name = "buchdrucknummer")
    private String buchdrucknummer;


    public BuchdruckNummer() {}


    public BuchdruckNummer(String buchdrucknummer) {
        this.buchdrucknummer = buchdrucknummer;
    }


    public String getBuchdrucknummer() {
        return buchdrucknummer;
    }

    public void setBuchdrucknummer(String buchdrucknummer) {
        this.buchdrucknummer = buchdrucknummer;
    }
}
