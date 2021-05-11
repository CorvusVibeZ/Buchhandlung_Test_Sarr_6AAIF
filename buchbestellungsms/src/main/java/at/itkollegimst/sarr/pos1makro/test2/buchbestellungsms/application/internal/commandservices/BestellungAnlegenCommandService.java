package at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.application.internal.commandservices;

import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.aggregates.Bestellung;
import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.aggregates.BestellungsId;
import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.commands.BestellungAnlegenCommand;
import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.infrastructure.brokers.repositories.BestellungsRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BestellungAnlegenCommandService {


    private BestellungsRepository bestellungsRepository;


    public BestellungAnlegenCommandService(BestellungsRepository bestellungsRepository) {
        this.bestellungsRepository = bestellungsRepository;
    }


    public BestellungsId bestellungAnlegen(BestellungAnlegenCommand bestellungAnlegenCommand) {

        String random = UUID.randomUUID().toString().toUpperCase();
        bestellungAnlegenCommand.setBestellungsId(random);

        Bestellung bestellung = new Bestellung(bestellungAnlegenCommand);
        bestellungsRepository.save(bestellung);

        return new BestellungsId(random);
    }
}
