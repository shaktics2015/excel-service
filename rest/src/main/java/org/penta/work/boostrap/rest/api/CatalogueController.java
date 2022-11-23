package org.penta.work.boostrap.rest.api;

import org.penta.work.boostrap.port.RequestCatalogue;
import org.penta.work.boostrap.port.model.Item;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/v1/catalogue")
public class CatalogueController {

    private RequestCatalogue requestCatalogue;

    public CatalogueController(RequestCatalogue requestCatalogue) {
        this.requestCatalogue = requestCatalogue;
    }

    @GetMapping(value = "/active")
    ResponseEntity activeMenu() {
        List<Item> items = requestCatalogue.getActiveMenu();
        return new ResponseEntity<>(items,
                HttpStatus.OK);
    }


    @PostMapping(value = "/add")
    ResponseEntity addItem(@RequestBody Item input) {
//        Item item = Item.builder().name("Roll").veg(true).price(BigDecimal.valueOf(111L)).build();
        boolean result = requestCatalogue.addItem(input);
        return new ResponseEntity<>(result,
                HttpStatus.OK);
    }

}
