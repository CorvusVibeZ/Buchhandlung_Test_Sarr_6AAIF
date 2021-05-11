package at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.interfaces.rest.transform;


import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.commands.BestellungAnlegenCommand;
import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.interfaces.rest.dto.BestellungAnlegenRessource;

public class BestellungAnlegenCommandDTOAssembler {


    public static BestellungAnlegenCommand toCommandFromDTO(BestellungAnlegenRessource bestellungAnlegenRessource) {

        return new BestellungAnlegenCommand(
                bestellungAnlegenRessource.getBestellungsId(),
                bestellungAnlegenRessource.getBuchtitel(),
                bestellungAnlegenRessource.getAutorname(),
                bestellungAnlegenRessource.getBeschreibung(),
                bestellungAnlegenRessource.getIsbn(),
                java.sql.Date.valueOf(bestellungAnlegenRessource.getBestelldatum())
        );
    }
}
