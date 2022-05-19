package org.penta.work.boostrap.port.outgoing;

import org.penta.work.boostrap.port.model.Account;

public interface Reader {

    Account load(Long accountNo);
}