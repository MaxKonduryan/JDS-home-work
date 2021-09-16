package com.sbrf.reboot.service;

import com.sbrf.reboot.exception.AccountException;
import com.sbrf.reboot.dto.Account;
import com.sbrf.reboot.repository.AccountRepository;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.Set;

@Data
public class AccountService {

    private final AccountRepository accountRepository;

    public boolean isAccountExist(long clientId, Account account) throws AccountException {
        Set<Account> accounts = accountRepository.getAllAccountsByClientId(clientId);
        return accounts.contains(account);
    }
}
