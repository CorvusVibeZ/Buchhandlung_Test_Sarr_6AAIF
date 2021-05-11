package at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.entities;


import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ISBN {



    @Column(name = "ISBN")
    private String ISBN;

    public ISBN() {}


    public ISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
