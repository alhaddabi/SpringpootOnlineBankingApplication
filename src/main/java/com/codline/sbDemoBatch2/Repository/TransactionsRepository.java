package com.codline.sbDemoBatch2.Repository;

import com.codline.sbDemoBatch2.Models.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionsRepository extends JpaRepository <Transactions , Long> {
}
