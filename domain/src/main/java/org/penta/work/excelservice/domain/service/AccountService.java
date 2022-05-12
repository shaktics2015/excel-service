package org.penta.work.excelservice.domain.service;

import org.penta.work.excelservice.port.model.Account;
import org.penta.work.excelservice.port.incoming.Deposit;
import org.penta.work.excelservice.port.incoming.Withdraw;
import org.penta.work.excelservice.port.outgoing.Writer;
import org.penta.work.excelservice.port.outgoing.Reader;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class AccountService implements Deposit, Withdraw {

    private Reader retrieveAccount;
    private Writer persistAccount;

    public AccountService(Reader retrieveAccount, Writer persistAccount) {
        this.retrieveAccount = retrieveAccount;
        this.persistAccount = persistAccount;
    }

    @Override
    public void deposit(Long accountNo, BigDecimal depositAmount) {
        Account account = retrieveAccount.load(accountNo);
        account.depositAmount(depositAmount);
        persistAccount.save(account);
    }

    @Override
    public boolean withdraw(Long accountNo, BigDecimal withdrawalAmount) {
        Account account = retrieveAccount.load(accountNo);
        boolean withdrawSucess = account.withdrawAmount(withdrawalAmount);

        if (withdrawSucess) {
            persistAccount.save(account);
        }
        return withdrawSucess;
    }


    @Override
    public Account getAccountInfo(Long accountNo) {
        Account account = retrieveAccount.load(accountNo);
        return account;
    }
}