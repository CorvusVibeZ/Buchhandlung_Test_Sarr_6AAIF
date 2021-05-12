package at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.application.internal.commandservices;

import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.aggregates.BestellungsId;
import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.valueobjects.Bestellstatus;
import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.infrastructure.brokers.repositories.BestellungsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BuchDruckenCommandService {


    @Autowired
    BestellungsRepository bestellungsRepository;


    @Transactional
    public void buchDrucken(String bestellundsId) {


        bestellungsRepository.updateBuchDruckAktivität(Bestellstatus.ABHOLBEREIT, new BestellungsId(bestellundsId));


    }


}
