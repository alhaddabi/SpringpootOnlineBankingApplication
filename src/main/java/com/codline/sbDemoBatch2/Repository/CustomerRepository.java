package com.codline.sbDemoBatch2.Repository;

import com.codline.sbDemoBatch2.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository <Customer , Long> {
}
