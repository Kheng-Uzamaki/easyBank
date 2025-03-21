package com.easybytes.accounts.service;

import com.easybytes.accounts.dto.CustomerDto;

public interface IAccountsService {
    /**
     *
     * @param customerDto -CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber -Input mobileNumber
     * @return Accounts Details base on given mobileNumber
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     *
     * @param customerDto -CustomerDto Object
     * @return boolean indicating if the update of Account is successful or not
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber -Input Mobile Number
     * @return boolean indicating if the delete of Account is successful or not
     */
    boolean deleteAccount(String mobileNumber);
}
