package at.itkollegimst.sarr.pos1makro.test2.buchdruckms.interfaces.events.transform;

import at.itkollegimst.sarr.pos1makro.test2.buchdruckms.domain.model.commands.BuchdruckAnlegenCommand;
import at.itkollegimst.sarr.pos1makro.test2.shareddomain.events.BestellungAnlegenEvent;
import at.itkollegimst.sarr.pos1makro.test2.shareddomain.events.BestellungAnlegenEventData;

public class BuchdruckAktivitätCommandEventAssembler {


    public static BuchdruckAnlegenCommand toCommandFromEvent(BestellungAnlegenEvent bestellungAnlegenEvent) {


        BestellungAnlegenEventData bestellungAnlegenEventData = bestellungAnlegenEvent.getBestellungAnlegenEventData();

        return new BuchdruckAnlegenCommand(
                bestellungAnlegenEventData.getBestellungsId()
        );
    }
}
