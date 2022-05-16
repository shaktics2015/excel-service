package org.penta.work.boostrap.port.incoming;

import java.math.BigDecimal;

public interface Deposit {

    void deposit(Long accountNo, BigDecimal depositAmount);
}