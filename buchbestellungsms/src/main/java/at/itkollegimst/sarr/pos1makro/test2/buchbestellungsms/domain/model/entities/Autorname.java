package at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Autorname {


    @Column(name = "autorname")
    private String autorname;

    public Autorname(){}

    public Autorname(String autorname) {
        this.autorname = autorname;
    }

    public String getAutorname() {
        return autorname;
    }

    public void setAutorname(String autorname) {
        this.autorname = autorname;
    }




}
