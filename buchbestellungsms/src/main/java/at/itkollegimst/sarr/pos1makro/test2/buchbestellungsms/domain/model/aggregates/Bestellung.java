package at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.aggregates;


import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.commands.BestellungAnlegenCommand;
import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.entities.*;
import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.valueobjects.Bestellstatus;

import javax.persistence.*;

@Entity
public class Bestellung {


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
    private Bestellstatus bestellstatus;




    public Bestellung(){}

    public Bestellung(BestellungAnlegenCommand bestellungAnlegenCommand) {


        this.bestellungsId = new BestellungsId(bestellungAnlegenCommand.getBestellungsId());
        this.buchtitel = new Buchtitel(bestellungAnlegenCommand.getBuchtitel());
        this.autorname = new Autorname(bestellungAnlegenCommand.getAutorname());
        this.beschreibung = new Beschreibung(bestellungAnlegenCommand.getBeschreibung());
        this.isbn = new ISBN(bestellungAnlegenCommand.getIsbn());
        this.bestelldatum = new Bestelldatum(bestellungAnlegenCommand.getBestelldatum());
        this.bestellstatus = Bestellstatus.NICHT_BESTELLT;




    }


}
