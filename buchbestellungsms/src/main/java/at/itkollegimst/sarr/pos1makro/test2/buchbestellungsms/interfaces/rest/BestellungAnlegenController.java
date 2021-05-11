package at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.interfaces.rest;


import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.application.internal.commandservices.BestellungAnlegenCommandService;
import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.application.internal.queryservices.BestellungAnlegenQueryService;
import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.aggregates.Bestellung;
import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.aggregates.BestellungsId;
import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.interfaces.rest.dto.BestellungAnlegenRessource;
import at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.interfaces.rest.transform.BestellungAnlegenCommandDTOAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/bestellungAnlegen")
public class BestellungAnlegenController {

    @Autowired
    private BestellungAnlegenCommandService bestellungAnlegenCommandService;

    @Autowired
    private BestellungAnlegenQueryService bestellungAnlegenQueryService;




    @PostMapping
    @ResponseBody
    public BestellungsId bestellungAnlegen(@RequestBody BestellungAnlegenRessource bestellungAnlegenRessource) {

        System.out.println("**Bestellung wurde angelegt!**");
        BestellungsId bestellungsId = bestellungAnlegenCommandService
                .bestellungAnlegen(BestellungAnlegenCommandDTOAssembler.toCommandFromDTO(bestellungAnlegenRessource));

        return bestellungsId;
    }




    @GetMapping
    @ResponseBody
    public List<Bestellung> listAll() {

        return bestellungAnlegenQueryService.findAll();
    }
}
