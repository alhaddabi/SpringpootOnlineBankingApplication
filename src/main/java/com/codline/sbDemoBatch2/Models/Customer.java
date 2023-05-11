package com.codline.sbDemoBatch2.Models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
public class Customer extends BaseEntity {
    @Id
            @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id ;

    @Column(name = "Customer_Name")
    String name;

    String designation;

    String Department;

    String Gender;
}
