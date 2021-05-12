package at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.infrastructure.brokers.repositories;


import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.aggregates.Bestellung;
import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.aggregates.BestellungsId;
import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.valueobjects.Bestellstatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BestellungsRepository extends JpaRepository<Bestellung, Long> {

    Bestellung findByBestellungsId(BestellungsId bestellungsId);

   /* @Query("Select b.bestellungsId from Bestellung b")
    List<BestellungsId> findAllBestellungsIds();

    */

    List<Bestellung> findAll();

/*
    @Query("update Bestellung set Bestellung.bestellstatus = :bestellstatus where Bestellung.bestellungsId = :bestellungs_id")
    void updateBuchDruckAktivität(@Param("bestellstatus") Bestellstatus bestellstatus, @Param("bestellungs_id") BestellungsId bestellungsId);
*/

}
