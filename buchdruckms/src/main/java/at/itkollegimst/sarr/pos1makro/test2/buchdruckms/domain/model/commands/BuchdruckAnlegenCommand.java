package at.itkollegimst.sarr.pos1makro.test2.buchdruckms.domain.model.commands;

import java.util.Locale;
import java.util.UUID;

public class BuchdruckAnlegenCommand {


    private String buchdrucknummer;

    private String bestellungsId;


    public BuchdruckAnlegenCommand() {}


    public BuchdruckAnlegenCommand(String buchdrucknummer, String bestellungsId) {
        this.buchdrucknummer = buchdrucknummer;
        this.bestellungsId = bestellungsId;
    }

    public BuchdruckAnlegenCommand(String bestellungsId) {

        this.bestellungsId = bestellungsId;
        this.buchdrucknummer = UUID.randomUUID().toString().toUpperCase();
    }

    public String getBuchdrucknummer() {
        return buchdrucknummer;
    }

    public void setBuchdrucknummer(String buchdrucknummer) {
        this.buchdrucknummer = buchdrucknummer;
    }

    public String getBestellungsId() {
        return bestellungsId;
    }

    public void setBestellungsId(String bestellungsId) {
        this.bestellungsId = bestellungsId;
    }
}
