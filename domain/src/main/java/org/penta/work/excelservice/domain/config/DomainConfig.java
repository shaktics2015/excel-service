package org.penta.work.excelservice.domain.config;

import org.penta.work.excelservice.domain.service.AccountService;
import org.penta.work.excelservice.port.incoming.Deposit;
import org.penta.work.excelservice.port.outgoing.Writer;
import org.penta.work.excelservice.port.outgoing.Reader;
import org.penta.work.jpa.read.ReadService;
import org.penta.work.jpa.write.WriteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomainConfig {
    @Bean
    public Reader retrieveAccount() {
        return new ReadService();
    }

    @Bean
    public Writer persistAccount() {
        return new WriteService();
    }


    @Bean
    public Deposit accountService() {
        return new AccountService(retrieveAccount(), persistAccount());
    }

}