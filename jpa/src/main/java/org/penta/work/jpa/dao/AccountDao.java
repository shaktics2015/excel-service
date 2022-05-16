package org.penta.work.jpa.dao;

import org.penta.work.jpa.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDao extends JpaRepository<AccountEntity, Long> {
}
