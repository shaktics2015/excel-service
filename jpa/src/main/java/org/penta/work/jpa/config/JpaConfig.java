package org.penta.work.jpa.config;

import org.penta.work.boostrap.port.ObtainAccounts;
import org.penta.work.jpa.AccountRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories//(basePackages = "org.penta.work.jpa")
public class JpaConfig {

//    @Autowired
//    AccountDao accountDao;

    @Bean
    public ObtainAccounts getAccountRepository() {//AccountDao accountDao
        return new AccountRepository();
    }
}
