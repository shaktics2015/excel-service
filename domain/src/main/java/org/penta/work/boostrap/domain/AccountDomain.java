package org.penta.work.boostrap.domain;

import lombok.Builder;
import org.penta.work.boostrap.port.ObtainAccounts;
import org.penta.work.boostrap.port.RequestAccounts;
import org.penta.work.boostrap.port.model.Account;

import java.util.List;
@Builder
public class AccountDomain implements RequestAccounts {

    private ObtainAccounts obtainAccounts;
    public AccountDomain(ObtainAccounts obtainAccounts) {
        this.obtainAccounts = obtainAccounts;
    }

    @Override
    public List<Account> getAccounts() {
        return obtainAccounts.getAccounts();
    }

    @Override
    public Account getAccount(final long id) {
        return obtainAccounts.getAccount(id);
    }
}
