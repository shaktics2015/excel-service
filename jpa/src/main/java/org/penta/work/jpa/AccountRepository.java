package org.penta.work.jpa;

import org.penta.work.boostrap.port.ObtainAccounts;
import org.penta.work.boostrap.port.model.Account;
import org.penta.work.jpa.utils.DataUtil;

import java.util.Collections;
import java.util.List;

public class AccountRepository implements ObtainAccounts {
// private AccountDao accountDao;
//
//      public AccountRepository(AccountDao accountDao) {
//        this.accountDao = accountDao;
//    }

    @Override
    public List<Account> getAccounts() {
        DataUtil dataUtil = DataUtil.getInstance();
        return Collections.singletonList(dataUtil.accounts.get(1L));
    }

    @Override
    public Account getAccount(long id) {
        DataUtil dataUtil = DataUtil.getInstance();
        return dataUtil.accounts.get(id);
    }
}
