package org.penta.work.excelservice.port.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class Account {

    private long accountNo;
    private BigDecimal accountBalance;

    public boolean withdrawAmount(BigDecimal withdrawalAmount) {
        if (accountBalance.compareTo(withdrawalAmount) < 0) {
            return false;
        }
        accountBalance = accountBalance.subtract(withdrawalAmount);
        return true;
    }

    public void depositAmount(BigDecimal depositAmount) {
        accountBalance = accountBalance.add(depositAmount);
    }
}