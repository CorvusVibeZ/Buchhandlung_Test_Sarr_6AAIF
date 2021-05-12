package at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.interfaces.rest.dto;


import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.valueobjects.Bestellstatus;

import java.time.LocalDate;
import java.util.Date;

public class BestellungAnlegenRessource {


    private String bestellungsId;

    private String buchtitel;

    private String autorname;

    private String beschreibung;

    private String isbn;

    private LocalDate bestelldatum;

    private Bestellstatus bestellstatus;

    public BestellungAnlegenRessource() {}


    public BestellungAnlegenRessource(String bestellungsId, String buchtitel, String autorname, String beschreibung, String isbn, LocalDate bestelldatum) {
        this.bestellungsId = bestellungsId;
        this.buchtitel = buchtitel;
        this.autorname = autorname;
        this.beschreibung = beschreibung;
        this.isbn = isbn;
        this.bestelldatum = bestelldatum;
        this.bestellstatus = Bestellstatus.BESTELLT;
    }

    public String getBestellungsId() {
        return bestellungsId;
    }

    public void setBestellungsId(String bestellungsId) {
        this.bestellungsId = bestellungsId;
    }

    public String getBuchtitel() {
        return buchtitel;
    }

    public void setBuchtitel(String buchtitel) {
        this.buchtitel = buchtitel;
    }

    public String getAutorname() {
        return autorname;
    }

    public void setAutorname(String autorname) {
        this.autorname = autorname;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LocalDate getBestelldatum() {
        return bestelldatum;
    }

    public void setBestelldatum(LocalDate bestelldatum) {
        this.bestelldatum = bestelldatum;
    }

    public Bestellstatus getBestellstatus() {
        return bestellstatus;
    }

    public void setBestellstatus(Bestellstatus bestellstatus) {
        this.bestellstatus = bestellstatus;
    }
}
