package at.itkollegimst.sarr.pos1makro.test2.buchdruckms.domain.model.aggregates;


import at.itkollegimst.sarr.pos1makro.test2.buchdruckms.domain.model.commands.BuchdruckAnlegenCommand;
import at.itkollegimst.sarr.pos1makro.test2.buchdruckms.domain.model.entities.BestellungsId;
import jdk.jfr.Name;

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
public class BuchdruckAktivität {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Embedded
    private BuchdruckNummer buchdrucknummer;


    @Embedded
    private BestellungsId bestellungsId;


    public BuchdruckAktivität() {}


    public BuchdruckAktivität(BuchdruckAnlegenCommand buchdruckAnlegenCommand){


        this.buchdruckNummer = new BuchdruckNummer(buchdruckAnlegenCommand.getBuchdrucknummer());

        this.bestellungsId = new BestellungsId(buchdruckAnlegenCommand.getBestellungsId());

    }



}
