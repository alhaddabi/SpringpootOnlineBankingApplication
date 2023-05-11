package com.codline.sbDemoBatch2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestmentsRepository extends JpaRepository< InvestmentsRepository , Long> {
}
