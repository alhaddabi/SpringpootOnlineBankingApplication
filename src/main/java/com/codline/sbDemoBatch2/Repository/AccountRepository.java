package com.codline.sbDemoBatch2.Repository;

import com.codline.sbDemoBatch2.Models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository <Account , Long> {
}
