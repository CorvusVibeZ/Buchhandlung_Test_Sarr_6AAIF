package at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.infrastructure.brokers.rabbitmq;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface BestellungsEventSource {

    @Output("bestellungAnlegenChannel")
    MessageChannel bestellungAnlegen();
}
