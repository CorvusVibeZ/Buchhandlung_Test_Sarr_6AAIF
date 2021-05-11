package at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.entities;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Date;

@Embeddable
public class Bestelldatum {


    @Column(name = "bestelldatum",unique = true, updatable = false)
    private Date bestelldatum;

    public Bestelldatum() {}

    public Bestelldatum(Date bestelldatum) {
        this.bestelldatum = bestelldatum;
    }

    public Date getBestelldatum() {
        return bestelldatum;
    }

    public void setBestelldatum(Date bestelldatum) {
        this.bestelldatum = bestelldatum;
    }
}
