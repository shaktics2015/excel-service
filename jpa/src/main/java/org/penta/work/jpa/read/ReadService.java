package org.penta.work.jpa.read;

import org.penta.work.excelservice.port.model.Account;
import org.penta.work.excelservice.port.outgoing.Reader;

import org.penta.work.jpa.utils.DataUtil;

public class ReadService implements Reader {

    @Override
    public Account load(Long accountNo) {
        DataUtil dataUtil = DataUtil.getInstance();
        return dataUtil.accounts.get(accountNo);
    }
}