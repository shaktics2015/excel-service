package org.penta.work.excelservice.port.incoming;

import java.math.BigDecimal;

public interface Deposit {

    void deposit(Long accountNo, BigDecimal depositAmount);
}