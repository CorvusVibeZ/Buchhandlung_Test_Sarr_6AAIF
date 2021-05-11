package at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.application.internal.outboundservices;


import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.infrastructure.brokers.rabbitmq.BestellungsEventSource;
import at.itkollegimst.sarr.pos1makro.test2.shareddomain.events.BestellungAnlegenEvent;
import jdk.jfr.Enabled;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionalEventListener;

@Service
@EnableBinding(BestellungsEventSource.class)
public class BestellungEventPublisherService {

    BestellungsEventSource bestellungsEventSource;

    public BestellungEventPublisherService(BestellungsEventSource bestellungsEventSource) {
        this.bestellungsEventSource = bestellungsEventSource;
    }


    @TransactionalEventListener
    public void handleBestellungAnlegenEvent(BestellungAnlegenEvent bestellungAnlegenEvent) {

        bestellungsEventSource.bestellungAnlegen().send(MessageBuilder.withPayload(bestellungAnlegenEvent).build());

    }
}
