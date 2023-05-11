package com.codline.sbDemoBatch2.Service;


import com.codline.sbDemoBatch2.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;


}
