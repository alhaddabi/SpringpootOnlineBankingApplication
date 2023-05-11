package com.codline.sbDemoBatch2.Models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
public class Transactions extends BaseEntity{
    @Id
            @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;

    Double amountOfTransaction ;



}
