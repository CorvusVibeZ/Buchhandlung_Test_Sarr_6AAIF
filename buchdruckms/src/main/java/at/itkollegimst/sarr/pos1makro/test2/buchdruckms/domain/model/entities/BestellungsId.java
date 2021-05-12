package at.itkollegimst.sarr.pos1makro.test2.buchdruckms.domain.model.entities;


import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BestellungsId {


    @Column(name = "bestellungs_id")
    private String bestellungsid;


    public BestellungsId() {}


    public BestellungsId(String bestellungsid) {
        this.bestellungsid = bestellungsid;
    }


    public String getBestellungsid() {
        return bestellungsid;
    }

    public void setBestellungsid(String bestellungsid) {
        this.bestellungsid = bestellungsid;
    }
}
