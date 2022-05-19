package org.penta.work.jpa.read;

import org.penta.work.boostrap.port.model.Account;
import org.penta.work.boostrap.port.outgoing.AccountReader;
 import org.penta.work.jpa.dao.AccountDao;
import org.penta.work.jpa.repository.AccountRepository;
import org.penta.work.jpa.utils.DataUtil;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AccountReadService implements AccountReader {
    private AccountRepository repository;

    public AccountReadService(AccountRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Account> loadAccounts(Long accountNo) {
        DataUtil dataUtil = DataUtil.getInstance();
        return  Collections.singletonList(dataUtil.accounts.get(accountNo));
    }

    @Override
    public List<Account> findAll() {
        List<Account> accounts = repository.findAll().stream()
                 .map(a ->  Account.builder().accountNo(a.getId()).accountBalance(BigDecimal.valueOf(1000)).build())
                .collect(Collectors.toList());
        return accounts;
    }

}
