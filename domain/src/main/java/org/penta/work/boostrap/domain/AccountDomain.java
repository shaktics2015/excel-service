package org.penta.work.boostrap.domain;

import lombok.Builder;
import org.penta.work.boostrap.port.ObtainAccounts;
import org.penta.work.boostrap.port.RequestAccounts;
import org.penta.work.boostrap.port.incoming.AccountWriter;
import org.penta.work.boostrap.port.model.Account;
import org.penta.work.boostrap.port.outgoing.AccountReader;

import java.util.List;

@Builder
public class AccountDomain implements RequestAccounts {

    private ObtainAccounts obtainAccounts;
    private AccountReader accountReader;
    private AccountWriter accountWriter;

    public AccountDomain(ObtainAccounts obtainAccounts, AccountReader accountReader, AccountWriter accountWriter) {
        this.obtainAccounts = obtainAccounts;
        this.accountReader = accountReader;
        this.accountWriter = accountWriter;
    }

    @Override
    public List<Account> getAccounts() {
        return accountReader.findAll();
    }

    @Override
    public Account getAccount(final long id) {
        return obtainAccounts.getAccount(id);
    }

    @Override
    public List<Account> getActiveAccounts() {
        return accountReader.loadAccounts(2L);
    }

    @Override
    public boolean addAccount(Account account) {
        return accountWriter.addAccount(account);
    }
}
