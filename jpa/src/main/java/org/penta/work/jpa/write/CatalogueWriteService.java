package org.penta.work.jpa.write;

import org.penta.work.boostrap.port.incoming.CatalogueWriter;
import org.penta.work.boostrap.port.model.Item;
import org.penta.work.jpa.entity.ItemEntity;
import org.penta.work.jpa.repository.ItemRepository;
import org.springframework.beans.BeanUtils;


public class CatalogueWriteService implements CatalogueWriter {
    private ItemRepository repository;

    public CatalogueWriteService(ItemRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean addItem(Item item) {
        ItemEntity itemEntity = new ItemEntity();
        BeanUtils.copyProperties(item, itemEntity);
        return repository.save(itemEntity).getId()>0;
    }
}
