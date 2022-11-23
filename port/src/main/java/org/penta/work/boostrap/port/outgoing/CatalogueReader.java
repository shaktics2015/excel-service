package org.penta.work.boostrap.port.outgoing;

import org.penta.work.boostrap.port.model.Item;

import java.util.List;

public interface CatalogueReader {
    List<Item> findAll();
}