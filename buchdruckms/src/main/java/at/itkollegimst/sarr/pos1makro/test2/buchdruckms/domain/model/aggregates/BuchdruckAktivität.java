package at.itkollegimst.sarr.pos1makro.test2.buchdruckms.domain.model.aggregates;


import at.itkollegimst.sarr.pos1makro.test2.buchdruckms.domain.model.commands.BuchdruckAnlegenCommand;
import at.itkollegimst.sarr.pos1makro.test2.buchdruckms.domain.model.entities.BestellungsId;
import at.itkollegimst.sarr.pos1makro.test2.shareddomain.events.BuchdruckAktivitätEvent;
import jdk.jfr.Name;
import org.springframework.data.domain.AbstractAggregateRoot;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name = "BuchdruckAktivität.findAll",
                query = "Select b from BuchdruckAktivität b"),
        @NamedQuery(name = "BuchdruckAktivität.findByBestellungsId",
                 query = "Select b from BuchdruckAktivität b where b.bestellungsId = :bestellungsId"),
        @NamedQuery(name = "BuchdruckAktivität.findByBuchdruckNummer",
                 query = "Select b from BuchdruckAktivität b where b.buchdrucknummer = :buchdrucknummer"),
        @NamedQuery(name = "BuchdruckAktivität.findAllBestellungsIds",
                 query = "Select b.bestellungsId from BuchdruckAktivität b")})
public class BuchdruckAktivität extends AbstractAggregateRoot<BuchdruckAktivität> {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Embedded
    private BuchdruckNummer buchdrucknummer;


    @Embedded
    private BestellungsId bestellungsId;


    public BuchdruckAktivität() {}


    public BuchdruckAktivität(BuchdruckAnlegenCommand buchdruckAnlegenCommand){


        this.buchdrucknummer = new BuchdruckNummer(buchdruckAnlegenCommand.getBuchdrucknummer());

        this.bestellungsId = new BestellungsId(buchdruckAnlegenCommand.getBestellungsId());


    }



    public void addDomainEvent(Object event) {

        registerEvent(event);
    }

}
