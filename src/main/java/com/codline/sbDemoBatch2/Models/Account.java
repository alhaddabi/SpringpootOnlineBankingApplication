package com.codline.sbDemoBatch2.Models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
public class Account extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id ;

    String bankName;

    String accountNumber;

    String accountHolderName;

    Boolean accountType;
}
