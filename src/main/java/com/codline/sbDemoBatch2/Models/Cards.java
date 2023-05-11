package com.codline.sbDemoBatch2.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Data
@Entity
public class Cards extends BaseEntity {
    @Id
            @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;

    Integer cardNumber ;

    String cadeHolderNumber;


}
