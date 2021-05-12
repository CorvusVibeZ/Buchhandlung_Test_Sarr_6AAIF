package at.itkollegimst.sarr.pos1makro.test2.buchdruckms.application.internal.outboundservices;

import at.itkollegimst.sarr.pos1makro.test2.buchdruckms.infrastructure.brokers.rabbitmq.BuchdruckAktivitätEventSource;
import at.itkollegimst.sarr.pos1makro.test2.shareddomain.events.BuchdruckAktivitätEvent;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionalEventListener;

@Service
@EnableBinding(BuchdruckAktivitätEventSource.class)
public class BuchdruckAktivitätEventPublisherService {

    BuchdruckAktivitätEventSource buchdruckAktivitätEventSource;

    public BuchdruckAktivitätEventPublisherService(BuchdruckAktivitätEventSource buchdruckAktivitätEventSource) {
        this.buchdruckAktivitätEventSource = buchdruckAktivitätEventSource;
    }

    @TransactionalEventListener
    public void handleBuchdruckAktivitätEvent(BuchdruckAktivitätEvent buchdruckAktivitätEvent) {

        buchdruckAktivitätEventSource.buchdrucken().send(MessageBuilder.withPayload(buchdruckAktivitätEvent).build());
    }
}
