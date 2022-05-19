package org.penta.work.jpa.config;

import org.penta.work.boostrap.port.ObtainAccounts;
import org.penta.work.boostrap.port.outgoing.AccountReader;
import org.penta.work.jpa.AccountRepository;
import org.penta.work.jpa.dao.AccountDao;
import org.penta.work.jpa.read.AccountReadService;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories//(basePackages = "org.penta.work.jpa")
public class JpaConfig {

//    @Autowired
//    AccountDao accountDao;

    @Bean
    public ObtainAccounts getAccountRepository() {//AccountDao accountDao
        return new AccountRepository();
    }
    @Bean
    public AccountReader getAccountReadService(AccountRepository repository) {//AccountDao accountDao
        return new AccountReadService(repository);
    }
}
