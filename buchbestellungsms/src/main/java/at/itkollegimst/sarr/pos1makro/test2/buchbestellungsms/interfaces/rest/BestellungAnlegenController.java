package at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.interfaces.rest;


import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.application.internal.commandservices.BestellungAnlegenCommandService;
import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.application.internal.queryservices.BestellungAnlegenQueryService;
import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.aggregates.Bestellung;
import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.aggregates.BestellungsId;
import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.interfaces.rest.dto.BestellungAnlegenRessource;
import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.interfaces.rest.transform.BestellungAnlegenCommandDTOAssembler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bestellungAnlegen")
public class BestellungAnlegenController {

    private BestellungAnlegenCommandService bestellungAnlegenCommandService;
    private BestellungAnlegenQueryService bestellungAnlegenQueryService;


    public BestellungAnlegenController(BestellungAnlegenCommandService bestellungAnlegenCommandService) {
        this.bestellungAnlegenCommandService = bestellungAnlegenCommandService;
    }


    @PostMapping
    @ResponseBody
    public BestellungsId bestellungAnlegen(@RequestBody BestellungAnlegenRessource bestellungAnlegenRessource) {

        System.out.println("**Bestellung wurde angelegt!**");
        BestellungsId bestellungsId = bestellungAnlegenCommandService
                .bestellungAnlegen(BestellungAnlegenCommandDTOAssembler.toCommandFromDTO(bestellungAnlegenRessource));

        return bestellungsId;
    }


    @GetMapping("findBestellung")
    @ResponseBody
    public Bestellung findByBestellungsId(@RequestParam("bestellungsId") String bestellungsId) {

        return bestellungAnlegenQueryService.find(new BestellungsId(bestellungsId));
    }
}
