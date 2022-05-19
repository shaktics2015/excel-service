package org.penta.work.jpa.config;

import org.penta.work.boostrap.port.ObtainAccounts;
import org.penta.work.boostrap.port.incoming.AccountWriter;
import org.penta.work.boostrap.port.outgoing.AccountReader;
 import org.penta.work.jpa.dao.AccountDao;
import org.penta.work.jpa.read.AccountReadService;
import org.penta.work.jpa.repository.AccountRepository;
import org.penta.work.jpa.write.AccountWriteService;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories//(basePackages = "org.penta.work.jpa")
public class JpaConfig {

//    @Autowired
//    AccountDao accountDao;

    @Bean
    public ObtainAccounts getAccountRepository() {//AccountDao accountDao
        return new org.penta.work.jpa.AccountRepository();
    }
    @Bean
    public AccountReader getAccountReadService(AccountRepository repository) {//AccountDao accountDao
        return new AccountReadService(repository);
    }
    @Bean
    public AccountWriter getAccountWriteService(AccountRepository repository) {//AccountDao accountDao
        return new AccountWriteService(repository);
    }

}
