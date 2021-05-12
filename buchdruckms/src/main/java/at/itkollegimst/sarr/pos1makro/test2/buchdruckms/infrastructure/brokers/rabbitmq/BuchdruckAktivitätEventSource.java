package at.itkollegimst.sarr.pos1makro.test2.buchdruckms.infrastructure.brokers.rabbitmq;


import org.hibernate.internal.build.AllowSysOut;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface BuchdruckAktivitätEventSource {


    String BESTELLUNG = "bestellungAnlegenChannel";
    @Input(BESTELLUNG)
    MessageChannel bestellungAnlegen();


    @Output("buchdruckenChannel")
    MessageChannel buchdrucken();
}
