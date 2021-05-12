package at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.interfaces.events;

import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.application.internal.commandservices.BuchDruckenCommandService;
import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.infrastructure.brokers.rabbitmq.BestellungsEventSource;
import at.itkollegimst.sarr.pos1makro.test2.shareddomain.events.BuchdruckAktivitätEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(BestellungsEventSource.class)
public class BuchBestellungEventHandler {


    @Autowired
    BuchDruckenCommandService buchDruckenCommandService;

    @StreamListener(target = BestellungsEventSource.BUCHDRUCKEN)
    public void receiveEvent(BuchdruckAktivitätEvent buchdruckAktivitätEvent) {

        buchDruckenCommandService.buchDrucken(buchdruckAktivitätEvent.getBuchdruckAktivitätEventData().getBestellungsid());

    }

}
