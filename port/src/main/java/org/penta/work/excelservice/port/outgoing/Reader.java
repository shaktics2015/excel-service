package org.penta.work.excelservice.port.outgoing;


import org.penta.work.excelservice.port.model.Account;

public interface Reader {

    Account load(Long accountNo);
}