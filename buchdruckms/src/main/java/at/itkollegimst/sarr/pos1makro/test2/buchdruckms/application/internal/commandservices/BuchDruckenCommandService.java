package at.itkollegimst.sarr.pos1makro.test2.buchdruckms.application.internal.commandservices;

import at.itkollegimst.sarr.pos1makro.test2.buchdruckms.domain.model.aggregates.BuchdruckAktivität;
import at.itkollegimst.sarr.pos1makro.test2.buchdruckms.domain.model.commands.BuchdruckAnlegenCommand;
import at.itkollegimst.sarr.pos1makro.test2.buchdruckms.domain.model.entities.BestellungsId;
import at.itkollegimst.sarr.pos1makro.test2.buchdruckms.infrastructure.repositories.BuchdruckAktivitätRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.event.TransactionalEventListener;

import javax.transaction.Transactional;

public class BuchDruckenCommandService {


    @Autowired
    BuchdruckAktivitätRepository buchdruckAktivitätRepository;

    @Transactional
    public void buchDrucken(BuchdruckAnlegenCommand buchdruckAnlegenCommand) {

       // BuchdruckAktivität buchdruckAktivität = new BuchdruckAktivität(buchdruckAnlegenCommand.getBestellungsId());

        //buchdruckAktivitätRepository.save(buchdruckAktivität);

        BuchdruckAktivität buchdruckAktivität = buchdruckAktivitätRepository.findByBestellungsId(new BestellungsId(buchdruckAnlegenCommand.getBestellungsId()));



    }

}
