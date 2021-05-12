package at.itkollegimst.sarr.pos1makro.test2.buchdruckms.interfaces.events;


import at.itkollegimst.sarr.pos1makro.test2.buchdruckms.application.internal.commandservices.BuchDruckenCommandService;
import at.itkollegimst.sarr.pos1makro.test2.buchdruckms.infrastructure.brokers.rabbitmq.BuchdruckAktivitätEventSource;
import at.itkollegimst.sarr.pos1makro.test2.buchdruckms.interfaces.events.transform.BuchdruckAktivitätCommandEventAssembler;
import at.itkollegimst.sarr.pos1makro.test2.shareddomain.events.BestellungAnlegenEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(BuchdruckAktivitätEventSource.class)
public class BuchdruckAktivitätEventHandler {



    @Autowired
    BuchDruckenCommandService buchDruckenCommandService;





    @StreamListener(target = BuchdruckAktivitätEventSource.BESTELLUNG)
    public void receiveEvent(BestellungAnlegenEvent bestellungAnlegenEvent) {

        buchDruckenCommandService.buchDrucken(BuchdruckAktivitätCommandEventAssembler.toCommandFromEvent(bestellungAnlegenEvent));
    }
}
