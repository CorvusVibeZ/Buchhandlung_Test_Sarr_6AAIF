package at.itkollegimst.sarr.pos1makro.test2.buchdruckms.domain.model.commands;

public class BuchdruckAnlegenCommand {


    private String buchdrucknummer;

    private String bestellungsId;


    public BuchdruckAnlegenCommand() {}


    public BuchdruckAnlegenCommand(String buchdrucknummer, String bestellungsId) {
        this.buchdrucknummer = buchdrucknummer;
        this.bestellungsId = bestellungsId;
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
