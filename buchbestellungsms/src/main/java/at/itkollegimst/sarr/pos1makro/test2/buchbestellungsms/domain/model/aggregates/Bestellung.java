package at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.aggregates;


import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.commands.BestellungAnlegenCommand;
import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.entities.*;
import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.valueobjects.Bestellstatus;
import at.itkollegimst.sarr.pos1makro.test2.shareddomain.events.BestellungAnlegenEvent;
import at.itkollegimst.sarr.pos1makro.test2.shareddomain.events.BestellungAnlegenEventData;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.AbstractAggregateRoot;

import javax.persistence.*;

@Entity
@EnableAutoConfiguration
@Table(name = "bestellung")
@NamedQueries({

        @NamedQuery(name = "bestellung.findAll",
                query = "Select b from Bestellung b"),
        @NamedQuery(name = "bestellung.findByBookingId",
                query = "Select b from Bestellung b where b.bestellungsId = :bestellungsId"),
        @NamedQuery(name = "bestellung.findAllBestellungsIds",
                query = "Select b.bestellungsId from Bestellung b") })
public class Bestellung extends AbstractAggregateRoot<Bestellung> {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Embedded
    private BestellungsId bestellungsId;


    @Embedded
    private Buchtitel buchtitel;


    @Embedded
    private Autorname autorname;

    @Embedded
    private Beschreibung beschreibung;


    @Embedded
    private ISBN isbn;

    @Embedded
    private Bestelldatum bestelldatum;

    @Embedded
    @Column(name = "bestellstatus")
    @Enumerated(EnumType.STRING)
    private Bestellstatus bestellstatus;





    public Bestellung(){}

    public Bestellung(BestellungAnlegenCommand bestellungAnlegenCommand) {


        this.bestellungsId = new BestellungsId(bestellungAnlegenCommand.getBestellungsId());
        this.buchtitel = new Buchtitel(bestellungAnlegenCommand.getBuchtitel());
        this.autorname = new Autorname(bestellungAnlegenCommand.getAutorname());
        this.beschreibung = new Beschreibung(bestellungAnlegenCommand.getBeschreibung());
        this.isbn = new ISBN(bestellungAnlegenCommand.getIsbn());
        this.bestelldatum = new Bestelldatum(bestellungAnlegenCommand.getBestelldatum());
        this.bestellstatus = Bestellstatus.BESTELLT;

        addDomainEvent(new BestellungAnlegenEvent(new BestellungAnlegenEventData(bestellungsId.getBestellungsId())));

    }


    public void addDomainEvent(Object event) {

        registerEvent(event);

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BestellungsId getBestellungsId() {
        return bestellungsId;
    }

    public void setBestellungsId(BestellungsId bestellungsId) {
        this.bestellungsId = bestellungsId;
    }

    public Buchtitel getBuchtitel() {
        return buchtitel;
    }

    public void setBuchtitel(Buchtitel buchtitel) {
        this.buchtitel = buchtitel;
    }

    public Autorname getAutorname() {
        return autorname;
    }

    public void setAutorname(Autorname autorname) {
        this.autorname = autorname;
    }

    public Beschreibung getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(Beschreibung beschreibung) {
        this.beschreibung = beschreibung;
    }

    public ISBN getIsbn() {
        return isbn;
    }

    public void setIsbn(ISBN isbn) {
        this.isbn = isbn;
    }

    public Bestelldatum getBestelldatum() {
        return bestelldatum;
    }

    public void setBestelldatum(Bestelldatum bestelldatum) {
        this.bestelldatum = bestelldatum;
    }

    public Bestellstatus getBestellstatus() {
        return bestellstatus;
    }

    public void setBestellstatus(Bestellstatus bestellstatus) {
        this.bestellstatus = bestellstatus;
    }
}
