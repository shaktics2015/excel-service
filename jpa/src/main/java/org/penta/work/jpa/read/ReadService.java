package org.penta.work.jpa.read;

import org.penta.work.boostrap.port.model.Account;
import org.penta.work.boostrap.port.outgoing.Reader;

import org.penta.work.jpa.utils.DataUtil;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class ReadService implements Reader {

    @Override
    public Account load(Long accountNo) {
        DataUtil dataUtil = DataUtil.getInstance();
        return dataUtil.accounts.get(accountNo);
    }
}