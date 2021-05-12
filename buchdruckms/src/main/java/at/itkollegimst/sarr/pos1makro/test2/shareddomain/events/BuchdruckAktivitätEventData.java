package at.itkollegimst.sarr.pos1makro.test2.shareddomain.events;

public class BuchdruckAktivitätEventData {


    private String bestellungsid;

    private String buchdrucknummer;


    public BuchdruckAktivitätEventData(String bestellungsid, String buchdrucknummer) {
        this.bestellungsid = bestellungsid;
        this.buchdrucknummer = buchdrucknummer;
    }

    public String getBestellungsid() {
        return bestellungsid;
    }

    public String getBuchdrucknummer() {
        return buchdrucknummer;
    }
}
