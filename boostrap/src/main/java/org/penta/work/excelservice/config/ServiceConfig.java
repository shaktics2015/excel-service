package org.penta.work.excelservice.config;

import org.penta.work.excelservice.AccountService;
import org.penta.work.excelservice.port.incoming.Deposit;
import org.penta.work.excelservice.port.outgoing.PersistAccount;
import org.penta.work.excelservice.port.outgoing.RetrieveAccount;
import org.penta.work.jpa.read.RetrieveAccountService;
import org.penta.work.jpa.write.PersistAccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ServiceConfig {
    @Bean
    public RetrieveAccount retrieveAccount(){
        return new RetrieveAccountService();
    }

    @Bean
    public PersistAccount persistAccount(){
        return new PersistAccountService();
    }



    @Bean
    public Deposit accountService(){
        return new AccountService(retrieveAccount(), persistAccount());
    }

}