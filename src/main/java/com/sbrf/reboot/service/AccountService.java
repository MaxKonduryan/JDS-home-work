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

    public Account getMaxAccountBalance(long clientId) throws AccountException {
        return accountRepository.getAllAccountsByClientId(clientId)
                .stream()
                .max(Comparator.comparing(Account::getBalance))
                .orElse(null)
                ;
    }

    public Set<Account> getAllAccountsByDateMoreThen(long clientId, LocalDate date) throws AccountException {
        return accountRepository.getAllAccountsByClientId(clientId)
                .stream()
                .filter(account -> !date.isAfter(account.getCreateDate()))
                .collect(Collectors.toSet())
                ;
    }

    public Set<Account> getAllAccountsWithOverdraftMoreThen(long clientId, BigDecimal limit) throws AccountException {
        return accountRepository.getAllAccountsByClientId(clientId)
                .stream()
                .filter(account -> limit.min(limit.negate()).compareTo(account.getBalance()) > 0)
                .collect(Collectors.toSet())
                ;
    }
}
