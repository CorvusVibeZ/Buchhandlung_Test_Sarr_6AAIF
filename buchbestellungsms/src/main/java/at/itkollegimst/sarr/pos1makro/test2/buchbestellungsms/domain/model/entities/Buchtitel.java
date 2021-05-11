package at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.entities;


import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Buchtitel {



    @Column(name = "buchtitel")
    private String buchtitel;

    public Buchtitel() {}


    public Buchtitel(String buchtitel) {
        this.buchtitel = buchtitel;
    }

    public String getBuchtitel() {
        return buchtitel;
    }

    public void setBuchtitel(String buchtitel) {
        this.buchtitel = buchtitel;
    }
}
