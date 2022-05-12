package org.penta.work.excelservice.port.incoming;

import org.penta.work.excelservice.port.model.Account;

import java.math.BigDecimal;

public interface Withdraw {

    boolean withdraw(Long accountNo, BigDecimal withdrawalAmount);

    Account getAccountInfo(Long accountNo);
}