package com.codline.sbDemoBatch2.Repository;

import com.codline.sbDemoBatch2.Models.Loans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LonasRepository extends JpaRepository <Loans , Long> {
}
