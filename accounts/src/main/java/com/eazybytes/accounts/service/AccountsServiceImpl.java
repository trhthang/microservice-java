package com.eazybytes.accounts.service;

import org.springframework.stereotype.Service;

import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.repository.AccountsRepository;
import com.eazybytes.accounts.repository.CustomerRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountService{

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {
        // TODO Auto-generated method stub

        
    }
}
