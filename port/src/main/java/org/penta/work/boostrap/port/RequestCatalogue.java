package org.penta.work.boostrap.port;

import org.penta.work.boostrap.port.model.Item;

import java.util.List;

public interface RequestCatalogue {
    List<Item> getActiveMenu();
    boolean addItem(Item item);
}
