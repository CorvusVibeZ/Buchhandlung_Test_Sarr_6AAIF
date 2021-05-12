package at.itkollegimst.sarr.pos1makro.test2.shareddomain.events;

public class BuchdruckAktivitätEventData {


    private String bestellungsid;

    public BuchdruckAktivitätEventData(String bestellungsid) {
        this.bestellungsid = bestellungsid;
    }

    public String getBestellungsid() {
        return bestellungsid;
    }
}
