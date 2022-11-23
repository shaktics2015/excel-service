package org.penta.work.jpa.read;

import org.penta.work.boostrap.port.model.Item;
import org.penta.work.boostrap.port.outgoing.CatalogueReader;
import org.penta.work.jpa.repository.ItemRepository;

import java.util.List;
import java.util.stream.Collectors;

public class CatalogueReadService implements CatalogueReader {
    private ItemRepository repository;

    public CatalogueReadService(ItemRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Item> findAll() {
        List<Item> items = repository.findAll().stream()
                 .map(a ->  Item.builder().id(a.getId()).name(a.getName()).veg(a.getVeg()).price(a.getPrice()).build())
                .collect(Collectors.toList());
        return items;
    }

}
