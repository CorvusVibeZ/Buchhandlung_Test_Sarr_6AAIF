package at.itkollegimst.sarr.pos1makro.test2.buchdruckms.infrastructure.repositories;

import at.itkollegimst.sarr.pos1makro.test2.buchdruckms.domain.model.aggregates.BuchdruckAktivität;
import at.itkollegimst.sarr.pos1makro.test2.buchdruckms.domain.model.entities.BestellungsId;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BuchdruckAktivitätRepository extends JpaRepository<BuchdruckAktivität,Long> {


    public BuchdruckAktivität findByBestellungsId(BestellungsId bestellungsId);

}
