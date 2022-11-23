package org.penta.work.boostrap.domain;

import lombok.Builder;
 import org.penta.work.boostrap.port.RequestCatalogue;
import org.penta.work.boostrap.port.incoming.CatalogueWriter;
import org.penta.work.boostrap.port.model.Item;
import org.penta.work.boostrap.port.outgoing.CatalogueReader;

import java.util.List;

@Builder
public class CatalogueDomain implements RequestCatalogue {

    private CatalogueReader catalogueReader;
    private CatalogueWriter catalogueWriter;

    public CatalogueDomain(CatalogueReader catalogueReader, CatalogueWriter catalogueWriter) {
        this.catalogueReader = catalogueReader;
        this.catalogueWriter = catalogueWriter;
    }

    @Override
    public List<Item> getActiveMenu() {
        return catalogueReader.findAll();
    }

    @Override
    public boolean addItem(Item item) {
        return catalogueWriter.addItem(item);
    }
}
