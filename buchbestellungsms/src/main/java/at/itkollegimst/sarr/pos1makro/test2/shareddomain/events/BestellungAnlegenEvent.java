package at.itkollegimst.sarr.pos1makro.test2.shareddomain.events;



public class BestellungAnlegenEvent {


    private BestellungAnlegenEventData bestellungAnlegenEventData;

    public BestellungAnlegenEvent(BestellungAnlegenEventData bestellungAnlegenEventData) {
        this.bestellungAnlegenEventData = bestellungAnlegenEventData;
    }

    public BestellungAnlegenEventData getBestellungAnlegenEventData() {
        return bestellungAnlegenEventData;
    }
}
