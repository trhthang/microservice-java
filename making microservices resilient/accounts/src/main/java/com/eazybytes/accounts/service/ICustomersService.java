package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDetailsDto;
import org.springframework.web.bind.annotation.RequestHeader;

public interface ICustomersService {

    CustomerDetailsDto fetchCustomerDetails(@RequestHeader("eazybank-correlation-id") String correlationId,String mobileNumber);
}
