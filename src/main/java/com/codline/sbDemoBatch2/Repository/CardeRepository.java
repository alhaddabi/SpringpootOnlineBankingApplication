package com.codline.sbDemoBatch2.Repository;


import com.codline.sbDemoBatch2.Models.Cards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardeRepository extends JpaRepository <Cards , Long> {
}
