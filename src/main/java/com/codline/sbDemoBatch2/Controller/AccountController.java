package com.codline.sbDemoBatch2.Controller;


import com.codline.sbDemoBatch2.Models.Account;
import com.codline.sbDemoBatch2.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping("Account/create")
    public void saveAccount () { createAccount();}

    public void createAccount()
    {
        Account employee = new Account();
        employee.setAccountNumber("wcwec");
        employee.setCreatedDate(new Date());
        employee.setAccountType(true);
        employee.setAccountHolderName("Adnan");
        employee.setBankName("BankMuscat");


    }
}
