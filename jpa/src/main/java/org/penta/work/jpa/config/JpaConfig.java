package org.penta.work.jpa.config;

import org.penta.work.boostrap.port.incoming.CatalogueWriter;
import org.penta.work.boostrap.port.outgoing.CatalogueReader;
import org.penta.work.jpa.read.CatalogueReadService;
import org.penta.work.jpa.repository.ItemRepository;
import org.penta.work.jpa.write.CatalogueWriteService;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("org.penta.work.jpa.entity")
@EnableJpaRepositories("org.penta.work.jpa.repository")
public class JpaConfig {
    @Bean
    public CatalogueReader getCatalogueReadService(ItemRepository repository) {
        return new CatalogueReadService(repository);
    }
    @Bean
    public CatalogueWriter getCatalogueWriteService(ItemRepository repository) {
        return new CatalogueWriteService(repository);
    }

}
