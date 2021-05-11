package at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.aggregates;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class BestellungsId implements Serializable {


    @Column(name = "bestellungsId")
    private String bestellungsId;



    public BestellungsId(){}


    public BestellungsId(String bestellungsId) {
        this.bestellungsId = bestellungsId;
    }

    public String getBestellungsId() {
        return bestellungsId;
    }
}
