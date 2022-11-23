package org.penta.work.boostrap.port.incoming;

import org.penta.work.boostrap.port.model.Item;

public interface CatalogueWriter {
    boolean addItem(Item item);
}