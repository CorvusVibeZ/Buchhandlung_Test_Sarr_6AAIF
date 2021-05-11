package at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.infrastructure.brokers.repositories;


import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.aggregates.Bestellung;
import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.aggregates.BestellungsId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BestellungsRepository extends JpaRepository<Bestellung, Long> {

    Bestellung findByBestellungsId(BestellungsId bestellungsId);

    List<BestellungsId> findAllBestellungsIds();

    List<Bestellung> findAll();
}
