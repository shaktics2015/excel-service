package org.penta.work.boostrap.port.incoming;

import org.penta.work.boostrap.port.model.Account;

import java.math.BigDecimal;

public interface Withdraw {

    boolean withdraw(Long accountNo, BigDecimal withdrawalAmount);

    Account getAccountInfo(Long accountNo);
}