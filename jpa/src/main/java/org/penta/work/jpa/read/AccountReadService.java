package org.penta.work.jpa.read;

import org.penta.work.boostrap.port.model.Account;
import org.penta.work.boostrap.port.outgoing.AccountReader;
import org.penta.work.jpa.AccountRepository;
import org.penta.work.jpa.dao.AccountDao;
import org.penta.work.jpa.utils.DataUtil;

import java.util.Collections;
import java.util.List;

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

}
