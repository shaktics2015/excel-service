package org.penta.work.boostrap.config;

import org.penta.work.boostrap.domain.AccountDomain;
import org.penta.work.boostrap.port.ObtainAccounts;
import org.penta.work.boostrap.port.RequestAccounts;
import org.penta.work.jpa.config.JpaConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(JpaConfig.class)
public class BootstrapConfig {
    @Bean
    public RequestAccounts getRequestAccounts(ObtainAccounts obtainAccounts) {
        return new AccountDomain(obtainAccounts);
    }

}