package com.sbrf.reboot.service;

import com.sbrf.reboot.exception.AccountException;
import com.sbrf.reboot.dto.Account;
import com.sbrf.reboot.repository.AccountRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class AccountServiceTest {

    AccountRepository accountRepository;

    AccountService accountService;

    @BeforeEach
    void setUp() {
        accountRepository = Mockito.mock(AccountRepository.class);

        accountService = new AccountService(accountRepository);
    }

    @Test
    void bookExist() throws AccountException {
        Account account = new Account("ACC1234NUM");
        Set<Account> accounts = new HashSet<>();
        accounts.add(account);

        when(accountRepository.getAllAccountsByClientId(1L)).thenReturn(accounts);

        assertTrue(accountService.isAccountExist(1L, account));
    }

    @Test
    void bookNotExist() throws AccountException {
        Set<Account> accounts = new HashSet<>();
        accounts.add(new Account("ACC1234NUM"));

        when(accountRepository.getAllAccountsByClientId(1L)).thenReturn(accounts);

        assertFalse(accountService.isAccountExist(1L, new Account("ACC456NUM")));
    }

    @Test
    void getMaxAccountBalance() throws AccountException {
        Account accountWithMaxBalance = Account.builder().clientId(1L).id(4L).balance(new BigDecimal(150000)).build();
        Set<Account> accounts = new HashSet<Account>() {{
            add(Account.builder().clientId(1L).id(1L).balance(BigDecimal.TEN).build());
            add(Account.builder().clientId(1L).id(2L).balance(new BigDecimal(200)).build());
            add(Account.builder().clientId(1L).id(3L).balance(new BigDecimal("1.65")).build());
            add(accountWithMaxBalance);
        }};

        when(accountRepository.getAllAccountsByClientId(1L)).thenReturn(accounts);

        assertEquals(accountWithMaxBalance, accountService.getMaxAccountBalance(1L));
    }

    @Test
    void getAllAccountsByDateMoreThen() throws AccountException {
        Account account1 = Account.builder().clientId(1L).createDate(LocalDate.now().minusDays(2)).build();
        Account account2 = Account.builder().clientId(1L).createDate(LocalDate.now().minusDays(3)).build();
        Account account3 = Account.builder().clientId(1L).createDate(LocalDate.now().minusDays(1)).build();
        Account account4 = Account.builder().clientId(1L).createDate(LocalDate.now().minusDays(7)).build();

        Set<Account> accounts = new HashSet<Account>() {{
            add(account1);
            add(account2);
            add(account3);
            add(account4);
        }};

        when(accountRepository.getAllAccountsByClientId(1L)).thenReturn(accounts);

        Set<Account> allAccountsByDateMoreThen = accountService.getAllAccountsByDateMoreThen(1L, LocalDate.now().minusDays(2));

        assertEquals(2, allAccountsByDateMoreThen.size());
        assertTrue(allAccountsByDateMoreThen.contains(account3));
    }

    @Test
    void getAllAccountsWithOverdraftMoreThen() throws AccountException {
        Account account1 = Account.builder().clientId(1L).balance(new BigDecimal("1.23")).build();
        Account account2 = Account.builder().clientId(1L).balance(new BigDecimal("45.67")).build();
        Account account3 = Account.builder().clientId(1L).balance(new BigDecimal("8.9")).build();
        Account account4 = Account.builder().clientId(1L).balance(new BigDecimal("0.12")).build();
        Account account5 = Account.builder().clientId(1L).balance(new BigDecimal("-1.23")).build();
        Account account6 = Account.builder().clientId(1L).balance(new BigDecimal("-45.67")).build();
        Account account7 = Account.builder().clientId(1L).balance(new BigDecimal("-8.9")).build();
        Account account8 = Account.builder().clientId(1L).balance(new BigDecimal("-0.12")).build();

        Set<Account> accounts = new HashSet<Account>() {{
            add(account1);
            add(account2);
            add(account3);
            add(account4);
            add(account5);
            add(account6);
            add(account7);
            add(account8);
        }};

        Set<Account> result = new HashSet<Account>() {{
            add(account6);
            add(account7);
        }};

        when(accountRepository.getAllAccountsByClientId(1L)).thenReturn(accounts);

        assertEquals(result, accountService.getAllAccountsWithOverdraftMoreThen(1L, new BigDecimal("1.23")));
    }
}