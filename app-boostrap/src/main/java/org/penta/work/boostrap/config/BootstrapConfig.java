package org.penta.work.boostrap.config;

import org.penta.work.boostrap.domain.CatalogueDomain;
import org.penta.work.boostrap.port.RequestCatalogue;
import org.penta.work.boostrap.port.incoming.CatalogueWriter;
import org.penta.work.boostrap.port.outgoing.CatalogueReader;
import org.penta.work.jpa.config.JpaConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(JpaConfig.class)
public class BootstrapConfig {
    @Bean
    public RequestCatalogue getRequestCatalogue(CatalogueReader catalogueReader, CatalogueWriter catalogueWriter) {
        return new CatalogueDomain(catalogueReader, catalogueWriter);
    }

}