package org.penta.work.boostrap.port.outgoing;


import org.penta.work.boostrap.port.model.Account;

public interface Writer {

    void save(Account account);
}