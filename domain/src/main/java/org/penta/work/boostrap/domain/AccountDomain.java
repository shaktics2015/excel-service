package org.penta.work.boostrap.domain;

import lombok.Builder;
import org.penta.work.boostrap.port.ObtainAccounts;
import org.penta.work.boostrap.port.RequestAccounts;
import org.penta.work.boostrap.port.model.Account;
import org.penta.work.boostrap.port.outgoing.AccountReader;

import java.util.List;

@Builder
public class AccountDomain implements RequestAccounts {

    private ObtainAccounts obtainAccounts;
    private AccountReader accountReader;

    public AccountDomain(ObtainAccounts obtainAccounts, AccountReader accountReader) {
        this.obtainAccounts = obtainAccounts;
        this.accountReader = accountReader;
    }

    @Override
    public List<Account> getAccounts() {
        return obtainAccounts.getAccounts();
    }

    @Override
    public Account getAccount(final long id) {
        return obtainAccounts.getAccount(id);
    }

    @Override
    public List<Account> getActiveAccounts() {
        return accountReader.loadAccounts(2L);
    }
}
