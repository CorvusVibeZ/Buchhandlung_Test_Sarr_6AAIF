package at.itkollegimst.sarr.pos1makro.test2.shareddomain.events;



public class BuchdruckAktivitätEvent {

    BuchdruckAktivitätEventData buchdruckAktivitätEventData;

    public BuchdruckAktivitätEvent(BuchdruckAktivitätEventData buchdruckAktivitätEventData) {
        this.buchdruckAktivitätEventData = buchdruckAktivitätEventData;
    }

    public BuchdruckAktivitätEventData getBuchdruckAktivitätEventData() {
        return buchdruckAktivitätEventData;
    }
}
