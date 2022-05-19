package org.penta.work.boostrap.domain;

import lombok.Builder;
 import org.penta.work.boostrap.port.RequestAccounts;
import org.penta.work.boostrap.port.incoming.AccountWriter;
import org.penta.work.boostrap.port.model.Account;
import org.penta.work.boostrap.port.outgoing.AccountReader;

import java.util.List;

@Builder
public class AccountDomain implements RequestAccounts {

    private AccountReader accountReader;
    private AccountWriter accountWriter;

    public AccountDomain(AccountReader accountReader, AccountWriter accountWriter) {
        this.accountReader = accountReader;
        this.accountWriter = accountWriter;
    }

    @Override
    public List<Account> getActiveAccounts() {
        return accountReader.findAll();
    }

    @Override
    public boolean addAccount(Account account) {
        return accountWriter.addAccount(account);
    }
}
