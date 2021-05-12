package at.itkollegimst.sarr.pos1makro.test2.shareddomain.events;



public class BestellungAnlegenEventData {

    private String bestellungsId;


    public BestellungAnlegenEventData(String bestellungsId) {
        this.bestellungsId = bestellungsId;
    }

    public String getBestellungsId() {
        return bestellungsId;
    }
}
