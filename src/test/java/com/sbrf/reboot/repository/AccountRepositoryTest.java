package com.sbrf.reboot.repository;

import com.sbrf.reboot.model.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class AccountRepositoryTest {

    AccountRepository accountRepository;

    @BeforeEach
    void setUp() {
        accountRepository = Mockito.mock(AccountRepository.class);
    }

    @Test
    void getAccounts() {
        Account account = new Account("ACC1234NUM");
        Set<Account> accounts = new HashSet<>();
        accounts.add(account);

        when(accountRepository.getAllAccountsByClientId(1L)).thenReturn(accounts);

        assertEquals(accountRepository.getAllAccountsByClientId(1L), accounts);
    }
}
