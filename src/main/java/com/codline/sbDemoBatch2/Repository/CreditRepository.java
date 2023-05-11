package com.codline.sbDemoBatch2.Repository;

import com.codline.sbDemoBatch2.Models.Credit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditRepository extends JpaRepository <Credit , Long> {
}
