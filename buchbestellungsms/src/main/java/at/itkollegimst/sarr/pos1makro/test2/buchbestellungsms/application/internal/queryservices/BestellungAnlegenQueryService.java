package at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.application.internal.queryservices;


import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.aggregates.Bestellung;
import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.aggregates.BestellungsId;
import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.infrastructure.brokers.repositories.BestellungsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BestellungAnlegenQueryService {

    @Autowired
    private BestellungsRepository bestellungsRepository;

    public List<Bestellung> findAll() {

        return bestellungsRepository.findAll();
    }


    public List<BestellungsId> getAllBestellungsIds() {

        return bestellungsRepository.findAllBestellungsIds();
    }

    public Bestellung find(BestellungsId bestellungsId) {

        return bestellungsRepository.findByBestellungsId(bestellungsId);

    }


}
